/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genetics;

import static genetics.Picture.DIMX;
import static genetics.Picture.DIMY;
import gui.Home;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author nikol
 */
public class Solution
{
    /**Parameters**/
    public static boolean STOP=false;
    
    public static int POP_SIZE=50;
    public static int MAX_ITER=100000;
    public static int MAX_SAME=1000;
    public static double P_CRO=0.9;
    public static double P_MUT=0.5;
    public static double GOAL_FIT=0.99;
    public static int SELECT=10;
    
    public static BufferedImage image;
    public static int iter=0;
    public static long time;
    
    public static BufferedImage solve()
    {
        time=System.currentTimeMillis();
        
        Individual.setGoalImage(image);
        
        Individual[] population=new Individual[POP_SIZE];
        for(int i=0;i<POP_SIZE;++i)population[i]=new Individual();
        
        Arrays.sort(population, Collections.reverseOrder());
        Individual.best=new Individual(population[0]);
        Individual bestLocal=new Individual(population[0]);
        
        int same=0;
        iter=0;
        for
        (
            iter=0;
            iter<=MAX_ITER &&
            ((double)bestLocal.getFitness()/((long)DIMX*DIMY*256))<GOAL_FIT &&
            same<MAX_SAME &&
            !STOP;
            ++iter
        )
        {
            Random rand=new Random();
            /**Crossing with selection**/
            if(rand.nextDouble()<=P_CRO)
            {
                Individual[] newPopulation=new Individual[POP_SIZE];
                double sum=0;
                for(Individual ind : population)
                    sum+=ind.getFitness();
                for(int i=0;i<POP_SIZE;++i)
                {
                    double prob=rand.nextDouble();
                    int index=0;
                    for(index=0;prob>=0&&index<POP_SIZE;++index)
                        prob-=population[index].getFitness()/sum;
                    Individual male=population[(index-1)%SELECT];
                    
                    prob=rand.nextDouble();
                    index=0;
                    for(index=0;prob>=0&&index<POP_SIZE;++index)
                        prob-=population[index].getFitness()/sum;
                    Individual female=population[(index-1)%SELECT];
                    
                    newPopulation[i]=male.cross(female);
                }
                population=newPopulation;
            }
            /**Mutating**/
            if(rand.nextDouble()<=P_MUT)
                for(Individual ind : population)
                    ind.mutate();
            population[POP_SIZE-1]=new Individual(Individual.best); //keeping the best
            /**Ranking population**/
            Arrays.sort(population, Collections.reverseOrder());
            bestLocal=new Individual(population[0]);
            /**Checking for repeated best**/
            if(Individual.best.getFitness()==bestLocal.getFitness())same++;
            else same=0;
            /**Showing the results**/
            Home.connection(bestLocal);
            if(iter%10==0)
            {
                try
                {
                    File outputfile = new File(Home.solutionLocation+"/"+iter+".png");
                    ImageIO.write(Individual.best.toImage(), "png", outputfile);
                }
                catch (IOException e) {}
            }
            /**Updating the best**/
            if(bestLocal.getFitness()>Individual.best.getFitness())
                Individual.best=new Individual(bestLocal);
        }
        Home.results(iter-1,System.currentTimeMillis()-time);
        return Individual.best.toImage();
    }
    
}
