/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genetics;

import static genetics.Picture.DIMX;
import static genetics.Picture.DIMY;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nikol
 */
public class Individual implements Comparable<Individual>
{
    /**Dimensions**/
    public static int NUM_GENES=5000;
    public static int MAXDIM=(DIMX>DIMY)?DIMX:DIMY;
    /**Global statistics**/
    public static Picture goalImage;
    public static Individual best;
    public static int iter=0;
    public static int same=0;
    /**Individual attributes**/
    private ArrayList<Gene> genome=new ArrayList<Gene>();
    private long fitness;
    
    public Individual()
    {
        Random rand=new Random();
        for(int i=0;i<NUM_GENES;++i)
            genome.add(new Gene());
        calculateFitness();
    }
    public Individual(ArrayList<Gene> genome)
    {
        this.genome=genome;
        calculateFitness();
    }
    public Individual(Individual other)
    {
        genome=(ArrayList<Gene>)other.genome.clone()/*new ArrayList<Gene>(other.genome)*/;
        fitness=other.fitness;
    }
    private void calculateFitness()
    {
        fitness=new Picture(genome).compare(goalImage);
    }
    public void mutate()
    {
        Random rand=new Random();
        genome.remove(rand.nextInt(NUM_GENES));
        genome.add(new Gene());
        calculateFitness();
    }
    public long getFitness()
    {
        return fitness;
    }
    public Individual cross(Individual other)
    {
        Random rand=new Random();
        ArrayList<Gene> newGenome=new ArrayList<Gene>();
        int cut=rand.nextInt(NUM_GENES);
        for(int i=0;i<NUM_GENES;++i)
        {
            if(i<cut)newGenome.add(genome.get(i));
            else newGenome.add(other.genome.get(i));
        }
        return new Individual(newGenome);
    }
    public static void setGoalImage(BufferedImage image)
    {
        goalImage=new Picture(image);
    }
    public BufferedImage toImage()
    {
        return new Picture(genome).toImage();
    }
    @Override
    public int compareTo(Individual other)
    {
        if(fitness>other.fitness)return 1;
        if(fitness<other.fitness)return -1;
        return 0;
    }
}