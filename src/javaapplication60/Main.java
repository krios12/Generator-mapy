
package javaapplication60;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Dawid
 */
public class Main {

   
   
    public static void main(String[] args) {
        
        Pole[] randTab = new Pole[10];
        double[] TabPrzeciwnika = new double[10];
          
        Random r = new Random();
        int Low = 1;
        int High = 5;
        int Result;
        
        
        
        BootIzi boot= new BootIzi();
        boot.generujStatki();
        
        randTab = boot.getDeterminicTab(1);
        
        for(int i = 0; i <  10 ;i++)
        {
            if(randTab[i].statek == true )
            {
                TabPrzeciwnika[i] = 1.0;
            }                       
        }
        
        
        
        boot.pokazMape();

        
        
        
        
       
        
                
        


        
         
    }
    
}
