
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0788763
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        
        int[] numbers = new int[6];
        
        numbers[0] = 20;
        
        for (int i=0; i<6; i++)
        {
            numbers[i] = rand.nextInt();
        }
        
        int[] days = {1, 2, 3, 4, 5};
        
        float[] otherNumbers = {1.1F, 2.4F, 3.3F};
        int arrayLength = otherNumbers.length;
        
        
        int[] playerScores = {0,0,0,0,0};
        playerScores[0]++;
        
        
        int bigNumber = rand.nextInt();
        if (bigNumber < 0)
        {
            bigNumber *= -1;
        }
        
        int[] bigArray = new int[bigNumber];
        
        
        for (int i=0; i<bigArray.length; i++)
        {
            bigArray[i] = rand.nextInt();
            System.out.println(bigArray[i]);
        }
        
        for (int item : bigArray)
        {
            System.out.println(item);
        }
    }
}
