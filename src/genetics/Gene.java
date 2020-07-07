/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genetics;

import static genetics.Picture.DIMX;
import static genetics.Picture.DIMY;
import java.util.Random;

/**
 *
 * @author nikol
 */
public class Gene
{
    public static int DIMXY=DIMX*DIMY;
    public static int MINR=1;
    public static int MAXR=15;
    
    //Coordinates
    //  x - chroms[0]
    //  y - chroms[1]
    //Radius
    //  r - chroms[2]
    //Color
    //  x - chroms[3]
    int[] chroms=new int[4];
    
    public Gene()
    {
        Random rand=new Random();
        chroms[0]=rand.nextInt(DIMX);
        chroms[1]=rand.nextInt(DIMY);
        chroms[2]=MINR+rand.nextInt(MAXR-MINR);
        
        chroms[3]=rand.nextInt(256);
    }
    public Gene(int x, int y, int r, int tone)
    {
        chroms[0]=x;
        chroms[1]=y;
        chroms[2]=r;
        
        chroms[3]=tone;
    }
    public int getX()
    {
        return chroms[0];
    }
    public int getY()
    {
        return chroms[1];
    }
    public int getR()
    {
        return chroms[2];
    }
    public int getTone()
    {
        return chroms[3];
    }
}
