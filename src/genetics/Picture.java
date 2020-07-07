/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genetics;

import java.awt.image.BufferedImage;
import static java.lang.Math.abs;
import java.util.ArrayList;

/**
 *
 * @author nikol
 */
public class Picture
{
    public static int DIMX=256;
    public static int DIMY=256;
    int[][] pixels = new int[DIMX][DIMY];
    {
        for(int i=0;i<DIMX;++i)
            for(int j=0;j<DIMY;++j)
                pixels[i][j]=0;
    }
            
    public Picture(){};
    public Picture(ArrayList<Gene> genome)
    {
        int[][] counts=new int[DIMX][DIMY];
        for(Gene gene : genome)
        {
            int X=gene.getX();
            int Y=gene.getY();
            int R=gene.getR();
            for(int x=(X>R)?(X-R):0;(x<X+R) && (x<DIMX);++x)
                for(int y=(Y>R)?(Y-R):0;(y<Y+R) && (y<DIMY);++y)
                {
                    if((x-X)*(x-X)+(y-Y)*(y-Y)<(R*R))
                    {
                        pixels[x][y]+=gene.getTone();
                        ++counts[x][y];
                    }
                }
        }
        for(int x=0;x<DIMX;++x)
            for(int y=0;y<DIMY;++y)
                if(counts[x][y]>0)
                    pixels[x][y]/=counts[x][y];
    }
    public Picture(BufferedImage image)
    {
        //DIMX=image.getWidth();
        //DIMY=image.getHeight();
        for(int i=0;i<DIMX;++i)
            for(int j=0;j<DIMY;++j)
                pixels[i][j]=image.getRGB(i, j)&0xff;
    }
    public Picture(int[][] pixels)
    {
        for(int i=0;i<DIMX;++i)
            for(int j=0;j<DIMY;++j)
                this.pixels[i][j]=pixels[i][j];
    }
    public long compare(Picture other)
    {
        long correct=256*DIMX*DIMY;
        for(int i=0;i<DIMX;++i)
            for(int j=0;j<DIMY;++j)
                correct-=abs(other.pixels[i][j]-pixels[i][j]);
        return correct;
    }
    public BufferedImage toImage()
    {
        BufferedImage image = new BufferedImage(DIMX, DIMY, /*BufferedImage.TYPE_BYTE_GRAY*/BufferedImage.TYPE_INT_ARGB);
        try
        {
            for(int x=0; x<DIMX; x++)
                for(int y=0; y<DIMY; y++)
                    image.setRGB(x,y,pixels[x][y]|(pixels[x][y]<<8)|(pixels[x][y]<<16)|0xff000000);
        }
        catch(Exception e) {}
        return image;
    }
}
