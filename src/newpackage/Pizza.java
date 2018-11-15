/*
 * Pizza class
 */
package newpackage;

/**
 *
 * @author trangluong
 */
public class Pizza {
    public boolean pepperoni, sausage, mushrooms;
    char size;
    
    public static final char small = 'S', medium = 'M', large = 'L';
   
    
    public Pizza(){
        pepperoni = sausage = mushrooms;
        size = 0;
    }
    
    public Pizza(boolean pepperoni, boolean sausage, boolean mushrooms, char size){
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.size = size;
        
    }
    public void setNumTopping(boolean pepperoni, boolean sausage, boolean mushrooms){
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
    }
    
    public void setSize(char size){
        this.size = size;
    }
    
    public char getSize(){
        if (size == small) 
            return 'S';
        else if (size == medium)
            return 'M';
        else if (size == large)
            return 'L';
        return 0;
    }
    
    public int getPepperoniTopping(){
        if  (pepperoni == true) 
            return 1;
        else
            return 0;
           }
    
    public int getSausageTopping(){
     if  (sausage == true) 
            return 1;
     else
            return 0;
           }
    
    public int getMushroomsTopping(){
        if  (mushrooms == true) 
            return 1;
        else
            return 0;
           }
        

    
}