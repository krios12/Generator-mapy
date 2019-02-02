
package javaapplication60;

import java.util.Random;

/**
 *
 * @author Dawid ulaniec
 */

public  class BootIzi {
    public Pole[][] tablica;
    int liczba;

    
    public BootIzi()
    {
        tablica= new Pole[12][12];
        for(int i = 0; i < 12; i++)
        {
            for(int j  = 0 ; j < 12 ; j++)
            {
                tablica[i][j]= new Pole();
            }
        }
    }
    public Pole[] getRandomTab()
    {
        Pole[] randTab = new Pole[10];
        Random rand = new Random();
        int x  = rand.nextInt(10 - 1 + 1) + 1;
        int y  = rand.nextInt(10 - 1 + 1) + 1;
        System.out.println(x);       
        System.out.println(y);
        int z =  rand.nextInt(1 - 0 + 1) + 0;
        int j = 0;
        if(z == 1)
        {
            
            for(int i = 1; i < 11; i++)
            {
                randTab[j] = this.tablica[i][x];
                j++;
            }
        }
        else
        {
            for(int i = 1; i < 11; i++)
            {
                randTab[j] = this.tablica[y][i];
                j++;
            }
        }
        
        return  randTab;
    }
    
    public Pole[] getDeterminicTab(int w)
    {
        Pole[] randTab = new Pole[10];
            int j = 0;
            for(int i = 1; i < 11; i++)
            {
                randTab[j] = this.tablica[w][i];
                j++;

            }
        

        
        return  randTab;
    }
    
    public void generujStatki()
    {
        postawCzteromasztowiecNew();
        postawTrzymasztowiecNew();
        postawTrzymasztowiecNew();
        postawDwumasztowiecNew();
        postawDwumasztowiecNew();
        postawDwumasztowiecNew();
        postawJednotowiecNew();
        postawJednotowiecNew();
        postawJednotowiecNew();
        postawJednotowiecNew();
    }
    public void postawCzteromasztowiec()
    {

        int index1, index2;
        int kierunek;
        Random rand = new Random();
        index1  = rand.nextInt(6 - 3 + 1) + 3;
        index2  = rand.nextInt(6 - 3 + 1) + 3;
        System.out.println(index1);
        System.out.println(index2);
        
        kierunek =rand.nextInt(3 - 0 + 1) + 0;  // 0 lewo / 1 prawo/ 2/ gora/ 3 dół
        System.out.println("Kierunek: "+kierunek);
        this.tablica[index1][index2].statek=true;
        this.tablica[index1][index2].wolne = false;
                
        
        if(kierunek == 0)
        {
            this.tablica[index1][index2-1].statek = true;
            this.tablica[index1][index2-1].wolne = false;
            this.tablica[index1][index2-2].statek = true;
            this.tablica[index1][index2-2].wolne = false;
            this.tablica[index1][index2-3].statek = true;
            this.tablica[index1][index2-3].wolne = false;
            if(index2-4 < 0)
            {
                this.tablica[index1][index2+1].obokStatku = true;
                this.tablica[index1][index2+1].wolne = false;
                
                
                this.tablica[index1+1][index2].obokStatku = true;
                this.tablica[index1+1][index2].wolne = false;                
                this.tablica[index1+1][index2-1].obokStatku = true;
                this.tablica[index1+1][index2-1].wolne = false;
                this.tablica[index1+1][index2-2].obokStatku = true;
                this.tablica[index1+1][index2-2].wolne = false;
                this.tablica[index1+1][index2-3].obokStatku = true;
                this.tablica[index1+1][index2-3].wolne = false;
                
                
                this.tablica[index1-1][index2].obokStatku = true;
                this.tablica[index1-1][index2].wolne = false;  
                this.tablica[index1-1][index2-1].obokStatku = true;
                this.tablica[index1-1][index2-1].wolne = false;
                this.tablica[index1-1][index2-2].obokStatku = true;
                this.tablica[index1-1][index2-2].wolne = false;
                this.tablica[index1-1][index2-3].obokStatku = true;
                this.tablica[index1-1][index2-3].wolne = false;  
            }
            else
            {
                this.tablica[index1][index2+1].obokStatku = true;
                this.tablica[index1][index2+1].wolne = false;
                          
                
                this.tablica[index1+1][index2].obokStatku = true;
                this.tablica[index1+1][index2].wolne = false;                
                this.tablica[index1+1][index2-1].obokStatku = true;
                this.tablica[index1+1][index2-1].wolne = false;
                this.tablica[index1+1][index2-2].obokStatku = true;
                this.tablica[index1+1][index2-2].wolne = false;
                this.tablica[index1+1][index2-3].obokStatku = true;
                this.tablica[index1+1][index2-3].wolne = false;
                
                
                this.tablica[index1-1][index2].obokStatku = true;
                this.tablica[index1-1][index2].wolne = false;  
                this.tablica[index1-1][index2-1].obokStatku = true;
                this.tablica[index1-1][index2-1].wolne = false;
                this.tablica[index1-1][index2-2].obokStatku = true;
                this.tablica[index1-1][index2-2].wolne = false;
                this.tablica[index1-1][index2-3].obokStatku = true;
                this.tablica[index1-1][index2-3].wolne = false; 
                
                this.tablica[index1][index2-4].obokStatku= true;
                this.tablica[index1][index2-4].wolne = false;
            }
        }
        else if(kierunek == 1)
        {
            this.tablica[index1][index2+1].statek = true;
            this.tablica[index1][index2+1].wolne = false;
            this.tablica[index1][index2+2].statek = true;
            this.tablica[index1][index2+2].wolne = false;
            this.tablica[index1][index2+3].statek = true;
            this.tablica[index1][index2+3].wolne = false;
            if(index2+4 > 9)
            {
                this.tablica[index1][index2-1].obokStatku = true;
                this.tablica[index1][index2-1].wolne = false;
                
                
                this.tablica[index1+1][index2].obokStatku = true;
                this.tablica[index1+1][index2].wolne = false;                
                this.tablica[index1+1][index2+1].obokStatku = true;
                this.tablica[index1+1][index2+1].wolne = false;
                this.tablica[index1+1][index2+2].obokStatku = true;
                this.tablica[index1+1][index2+2].wolne = false;
                this.tablica[index1+1][index2+3].obokStatku = true;
                this.tablica[index1+1][index2+3].wolne = false;
                
                
                this.tablica[index1-1][index2].obokStatku = true;
                this.tablica[index1-1][index2].wolne = false;  
                this.tablica[index1-1][index2+1].obokStatku = true;
                this.tablica[index1-1][index2+1].wolne = false;
                this.tablica[index1-1][index2+2].obokStatku = true;
                this.tablica[index1-1][index2+2].wolne = false;
                this.tablica[index1-1][index2+3].obokStatku = true;
                this.tablica[index1-1][index2+3].wolne = false;
            }
            else
            {
                this.tablica[index1][index2-1].obokStatku = true;
                this.tablica[index1][index2-1].wolne = false;
                
                
                this.tablica[index1+1][index2].obokStatku = true;
                this.tablica[index1+1][index2].wolne = false;                
                this.tablica[index1+1][index2+1].obokStatku = true;
                this.tablica[index1+1][index2+1].wolne = false;
                this.tablica[index1+1][index2+2].obokStatku = true;
                this.tablica[index1+1][index2+2].wolne = false;
                this.tablica[index1+1][index2+3].obokStatku = true;
                this.tablica[index1+1][index2+3].wolne = false;
                
                
                this.tablica[index1-1][index2].obokStatku = true;
                this.tablica[index1-1][index2].wolne = false;  
                this.tablica[index1-1][index2+1].obokStatku = true;
                this.tablica[index1-1][index2+1].wolne = false;
                this.tablica[index1-1][index2+2].obokStatku = true;
                this.tablica[index1-1][index2+2].wolne = false;
                this.tablica[index1-1][index2+3].obokStatku = true;
                this.tablica[index1-1][index2+3].wolne = false;
                
                this.tablica[index1][index2+4].obokStatku= true;
                this.tablica[index1][index2+4].wolne = false;
            }
            
        }
        else if(kierunek == 2)
        {
            this.tablica[index1-1][index2].statek = true;
            this.tablica[index1-1][index2].wolne = false;
            this.tablica[index1-2][index2].statek = true;
            this.tablica[index1-2][index2].wolne = false;
            this.tablica[index1-3][index2].statek = true;
            this.tablica[index1-3][index2].wolne = false;
            if(index1-4 < 0)
            {
                this.tablica[index1+1][index2].obokStatku = true;
                this.tablica[index1+1][index2].wolne = false;
                
                
                this.tablica[index1][index2+1].obokStatku = true;
                this.tablica[index1][index2+1].wolne = false;                
                this.tablica[index1-1][index2+1].obokStatku = true;
                this.tablica[index1-1][index2+1].wolne = false;
                this.tablica[index1-2][index2+1].obokStatku = true;
                this.tablica[index1-2][index2+1].wolne = false;
                this.tablica[index1-3][index2+1].obokStatku = true;
                this.tablica[index1-3][index2+1].wolne = false;
                
                
                this.tablica[index1][index2-1].obokStatku = true;
                this.tablica[index1][index2-1].wolne = false;                
                this.tablica[index1-1][index2-1].obokStatku = true;
                this.tablica[index1-1][index2-1].wolne = false;
                this.tablica[index1-2][index2-1].obokStatku = true;
                this.tablica[index1-2][index2-1].wolne = false;
                this.tablica[index1-3][index2-1].obokStatku = true;
                this.tablica[index1-3][index2-1].wolne = false;
            }
            else
            {
                this.tablica[index1+1][index2].obokStatku = true;
                this.tablica[index1+1][index2].wolne = false;
                
                
                this.tablica[index1][index2+1].obokStatku = true;
                this.tablica[index1][index2+1].wolne = false;                
                this.tablica[index1-1][index2+1].obokStatku = true;
                this.tablica[index1-1][index2+1].wolne = false;
                this.tablica[index1-2][index2+1].obokStatku = true;
                this.tablica[index1-2][index2+1].wolne = false;
                this.tablica[index1-3][index2+1].obokStatku = true;
                this.tablica[index1-3][index2+1].wolne = false;
                
                
                this.tablica[index1][index2-1].obokStatku = true;
                this.tablica[index1][index2-1].wolne = false;                
                this.tablica[index1-1][index2-1].obokStatku = true;
                this.tablica[index1-1][index2-1].wolne = false;
                this.tablica[index1-2][index2-1].obokStatku = true;
                this.tablica[index1-2][index2-1].wolne = false;
                this.tablica[index1-3][index2-1].obokStatku = true;
                this.tablica[index1-3][index2-1].wolne = false;
                
                this.tablica[index1-4][index2].obokStatku= true;
                this.tablica[index1-4][index2].wolne = false;
            }
        }
        else if(kierunek == 3)
        {
            this.tablica[index1+1][index2].statek = true;
            this.tablica[index1+1][index2].wolne = false;
            this.tablica[index1+2][index2].statek = true;
            this.tablica[index1+2][index2].wolne = false;
            this.tablica[index1+3][index2].statek = true;
            this.tablica[index1+3][index2].wolne = false;
            if(index1+4 > 9)
            {
                this.tablica[index1-1][index2].obokStatku = true;
                this.tablica[index1-1][index2].wolne = false;
                
                this.tablica[index1][index2+1].obokStatku = true;
                this.tablica[index1][index2+1].wolne = false;                
                this.tablica[index1+1][index2+1].obokStatku = true;
                this.tablica[index1+1][index2+1].wolne = false;
                this.tablica[index1+2][index2+1].obokStatku = true;
                this.tablica[index1+2][index2+1].wolne = false;
                this.tablica[index1+3][index2+1].obokStatku = true;
                this.tablica[index1+3][index2+1].wolne = false;
                
                
                this.tablica[index1][index2-1].obokStatku = true;
                this.tablica[index1][index2-1].wolne = false;                
                this.tablica[index1+1][index2-1].obokStatku = true;
                this.tablica[index1+1][index2-1].wolne = false;
                this.tablica[index1+2][index2-1].obokStatku = true;
                this.tablica[index1+2][index2-1].wolne = false;
                this.tablica[index1+3][index2-1].obokStatku = true;
                this.tablica[index1+3][index2-1].wolne = false;
                

            }
            else
            {
                this.tablica[index1-1][index2].obokStatku = true;
                this.tablica[index1-1][index2].wolne = false;
                
                this.tablica[index1][index2+1].obokStatku = true;
                this.tablica[index1][index2+1].wolne = false;                
                this.tablica[index1+1][index2+1].obokStatku = true;
                this.tablica[index1+1][index2+1].wolne = false;
                this.tablica[index1+2][index2+1].obokStatku = true;
                this.tablica[index1+2][index2+1].wolne = false;
                this.tablica[index1+3][index2+1].obokStatku = true;
                this.tablica[index1+3][index2+1].wolne = false;
                
                
                this.tablica[index1][index2-1].obokStatku = true;
                this.tablica[index1][index2-1].wolne = false;                
                this.tablica[index1+1][index2-1].obokStatku = true;
                this.tablica[index1+1][index2-1].wolne = false;
                this.tablica[index1+2][index2-1].obokStatku = true;
                this.tablica[index1+2][index2-1].wolne = false;
                this.tablica[index1+3][index2-1].obokStatku = true;
                this.tablica[index1+3][index2-1].wolne = false;
                
                this.tablica[index1+4][index2].obokStatku= true;
                this.tablica[index1+4][index2].wolne = false;
            }
        }
        
        
            
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public void postawCzteromasztowiecNew()
    {
        int index1, index2;
        int kierunek;
        Random rand = new Random();
        index1  = rand.nextInt(10 - 1 + 1) + 1;
        index2  = rand.nextInt(10 - 1 + 1) + 1;
        kierunek =rand.nextInt(3 - 0 + 1) + 0; 
        
        while(sprawdzKonfliktStatku(index1,index2,kierunek, 4) == false)
        {
            index1  = rand.nextInt(10 - 1 + 1) + 1;
            index2  = rand.nextInt(10 - 1 + 1) + 1;
            kierunek =rand.nextInt(3 - 0 + 1) + 0; 
        }
       // System.out.println(sprawdzKonfliktStatku(index1,index2,kierunek, 4));
        postawNmasztowiec(4, index1,index2,kierunek);
        
    }
    public void postawTrzymasztowiecNew()
    {
        int index1, index2;
        int kierunek;
        Random rand = new Random();
        index1  = rand.nextInt(10 - 1 + 1) + 1;
        index2  = rand.nextInt(10 - 1 + 1) + 1;
        kierunek =rand.nextInt(3 - 0 + 1) + 0; 
        
        while(sprawdzKonfliktStatku(index1,index2,kierunek, 3) == false)
        {
            index1  = rand.nextInt(10 - 1 + 1) + 1;
            index2  = rand.nextInt(10 - 1 + 1) + 1;
            kierunek =rand.nextInt(3 - 0 + 1) + 0; 
        }
       // System.out.println(sprawdzKonfliktStatku(index1,index2,kierunek, 3));
        postawNmasztowiec(3, index1,index2,kierunek);
        
    }
    
    public void postawDwumasztowiecNew()
    {
        int index1, index2;
        int kierunek;
        Random rand = new Random();
        index1  = rand.nextInt(10 - 1 + 1) + 1;
        index2  = rand.nextInt(10 - 1 + 1) + 1;
        kierunek =rand.nextInt(3 - 0 + 1) + 0; 
        
        while(sprawdzKonfliktStatku(index1,index2,kierunek, 2) == false)
        {
            index1  = rand.nextInt(10 - 1 + 1) + 1;
            index2  = rand.nextInt(10 - 1 + 1) + 1;
            kierunek =rand.nextInt(3 - 0 + 1) + 0; 
        }
       // System.out.println(sprawdzKonfliktStatku(index1,index2,kierunek, 2));
        postawNmasztowiec(2, index1,index2,kierunek);
        
    }
    
    public void postawJednotowiecNew()
    {
        int index1, index2;
        int kierunek;
        Random rand = new Random();
        index1  = rand.nextInt(10 - 1 + 1) + 1;
        index2  = rand.nextInt(10 - 1 + 1) + 1;
        kierunek =rand.nextInt(3 - 0 + 1) + 0; 
        
        while(sprawdzKonfliktStatku(index1,index2,kierunek, 1) == false)
        {
            index1  = rand.nextInt(10 - 1 + 1) + 1;
            index2  = rand.nextInt(10 - 1 + 1) + 1;
            kierunek =rand.nextInt(3 - 0 + 1) + 0; 
        }
        //System.out.println(sprawdzKonfliktStatku(index1,index2,kierunek, 1));
        postawNmasztowiec(1, index1,index2,kierunek);
        
    }
    
    public void postawNmasztowiec(int liczbaMasztow, int index1, int index2, int kierunek)
    {
 
        if(kierunek == 0)
        {
            int j=0;
            int i=index1;
            
            this.tablica[i+1][index2].obokStatku=true;
            this.tablica[i+1][index2].wolne = false;
            

            while(j!=liczbaMasztow)
            {
               this.tablica[i][index2].statek=true;
               this.tablica[i][index2].wolne = false;
               
               this.tablica[i][index2+1].obokStatku=true;
               this.tablica[i][index2+1].wolne=false;
               
               this.tablica[i][index2-1].obokStatku=true;
               this.tablica[i][index2-1].wolne=false;
               i--;
               j++;
            }
            this.tablica[i][index2].obokStatku=true;
            this.tablica[i][index2].wolne = false;
            
        }
        else if(kierunek == 1)
        {
            int j=0;
            int i=index1;
            this.tablica[i-1][index2].obokStatku=true;
            this.tablica[i-1][index2].wolne = false;
            while(j!=liczbaMasztow)
            {
               this.tablica[i][index2].statek=true;
               this.tablica[i][index2].wolne = false;
               
               this.tablica[i][index2+1].obokStatku=true;
               this.tablica[i][index2+1].wolne=false;
               
               this.tablica[i][index2-1].obokStatku=true;
               this.tablica[i][index2-1].wolne=false;
               i++;
               j++;
            }
            this.tablica[i][index2].obokStatku=true;
            this.tablica[i][index2].wolne = false;
        }
        else if(kierunek == 2)
        {
            int j=0;
            int i = index2;
            this.tablica[index1][i+1].obokStatku=true;
            this.tablica[index1][i+1].wolne = false;
            
            while(j!=liczbaMasztow)
            {
              this.tablica[index1][i].statek = true;
              this.tablica[index1][i].wolne = false;
              
              this.tablica[index1+1][i].obokStatku = true;
              this.tablica[index1+1][i].wolne = false;
              
              this.tablica[index1-1][i].obokStatku = true;
              this.tablica[index1-1][i].wolne = false;
              i--;
              j++;
            }
            this.tablica[index1][i].obokStatku=true;
            this.tablica[index1][i].wolne = false;
        }
        else if (kierunek == 3)
        {
            int j=0;
            int i = index2;
            this.tablica[index1][i-1].obokStatku=true;
            this.tablica[index1][i-1].wolne = false;
            while(j!=liczbaMasztow)
            {
              this.tablica[index1][i].statek = true;
              this.tablica[index1][i].wolne = false;
              
              this.tablica[index1+1][i].obokStatku = true;
              this.tablica[index1+1][i].wolne = false;
              
              this.tablica[index1-1][i].obokStatku = true;
              this.tablica[index1-1][i].wolne = false;
              i++;
              j++;
            }
            this.tablica[index1][i].obokStatku=true;
            this.tablica[index1][i].wolne = false;
        }
        

    }
    public boolean sprawdzKonfliktStatku(int index1,int index2, int kierunek, int liczbaMasztow)
    {
       boolean tmp = true;
       if(index1 - liczbaMasztow >=0 && kierunek == 0)
       {
          tmp= sprawdzKonflikt(index1,index2, kierunek,liczbaMasztow);
       }
       else if(index1 + liczbaMasztow <= 11 && kierunek == 1)
       {
           tmp= sprawdzKonflikt(index1,index2, kierunek,liczbaMasztow);
       }
       else if(index2 - liczbaMasztow >= 0 && kierunek == 2)
       {
           tmp= sprawdzKonflikt(index1,index2, kierunek,liczbaMasztow);
       }
       else if(index2 + liczbaMasztow <= 11 && kierunek == 3)
       {
           tmp= sprawdzKonflikt(index1,index2, kierunek,liczbaMasztow);
       }
       else
       {
           tmp = false;
       }
       return tmp;
    }
    
    public boolean sprawdzKonflikt(int index1,int index2, int kierunek, int liczbaMasztow)
    {
        boolean tmp=true;

        if(kierunek == 0)
        {
            if(this.tablica[index1+1][index2].statek == true)
            {
                tmp= false;
            }
            for(int i = index1; i > index1 - liczbaMasztow; i--)
            {
                if(this.tablica[i][index2].wolne == false)
                {
                  tmp = false;  
                }
                
            }
            if(this.tablica[index1-liczbaMasztow][index2].statek ==  true)
            {
                tmp = false;
            }
            
            for(int i = index1; i > index1 - liczbaMasztow; i--)
            {
                if(this.tablica[i][index2-1].statek == true)
                {
                  tmp = false;  
                }
                
            }
            for(int i = index1; i > index1 - liczbaMasztow; i--)
            {
                if(this.tablica[i][index2+1].statek == true)
                {
                  tmp = false;  
                }
                
            }
            
            
            
            
        }
        else if(kierunek == 1)
        {
            if(this.tablica[index1-1][index2].statek == true)
            {
                tmp= false;
            }
            for(int i = index1; i < index1 + liczbaMasztow; i++)
            {
                if(this.tablica[i][index2].wolne == false)
                {
                  tmp = false;  
                }
            }
            if(this.tablica[index1+liczbaMasztow][index2].statek ==  true)
            {
                tmp = false;
            }
            
            for(int i = index1; i < index1 + liczbaMasztow; i++)
            {
                if(this.tablica[i][index2-1].statek == true)
                {
                  tmp = false;  
                }
            }
                        for(int i = index1; i < index1 + liczbaMasztow; i++)
            {
                if(this.tablica[i][index2+1].statek == true)
                {
                  tmp = false;  
                }
            }
        }
        else if(kierunek == 2)
        {
            if(this.tablica[index1][index2+1].statek == true)
            {
                tmp = false;
            }
            for(int i = index2; i > index2 - liczbaMasztow; i--)
            {
                if(this.tablica[index1][i].wolne == false)
                {
                    tmp = false;
                }
            }
            if(this.tablica[index1][index2-liczbaMasztow].statek == true)
            {
                tmp = false;
            }
            for(int i = index2; i > index2 - liczbaMasztow; i--)
            {
                if(this.tablica[index1+1][i].statek == true)
                {
                    tmp = false;
                }
            }
            for(int i = index2; i > index2 - liczbaMasztow; i--)
            {
                if(this.tablica[index1-1][i].statek == true)
                {
                    tmp = false;
                }
            }
        }
        else if(kierunek ==3)
        {
            if(this.tablica[index1][index2-1].statek == true)
            {
                tmp = false;
            }
            for(int i = index2; i < index2 + liczbaMasztow; i++)
            {
                if(this.tablica[index1][i].wolne == false)
                {
                    tmp = false;
                }
            }
            if(this.tablica[index1][index2+liczbaMasztow].statek == true)
            {
                tmp = false;
            }
            for(int i = index2; i < index2 + liczbaMasztow; i++)
            {
                if(this.tablica[index1+1][i].statek == true)
                {
                    tmp = false;
                }
            }
            for(int i = index2; i < index2 + liczbaMasztow; i++)
            {
                if(this.tablica[index1-1][i].statek == true)
                {
                    tmp = false;
                }
            }
        }
        
        if(tmp == false)
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }
    
    public void pokazMape()
    {
        
        for(int j = 1; j < 11; j++)
        {
            for(int i  = 1 ; i < 11 ; i++)
            {
                if(tablica[i][j].statek==true)
                {
                    System.out.print(1+" ");
                }
                else if(tablica[i][j].obokStatku==true)
                {
                    System.out.print("~"+" ");
                }
                else
                {
                    System.out.print(0+" ");
                }
                
            }
            System.out.println();
        }
        
    }
    


    
}

