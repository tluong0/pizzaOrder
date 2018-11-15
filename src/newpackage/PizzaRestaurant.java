/*
 * Pizza order main class
 */
package newpackage;

import java.util.Scanner;



/**
 *
 * @author trangluong
 */
public class PizzaRestaurant {
    static PizzaOrder order = new PizzaOrder();
    static double totalCost = 0;
        
    static   int totalNumPizza = 0;
    public static void main(String[]args){
        
            pOrder();
        order.toString();
        System.out.println("Total number of pizza ordered " + totalNumPizza);
        System.out.println("Your total cost is " + totalCost);
    
}
    //Ask user for more pizza and calculate total cost and num of pizzas
    public static void pOrder(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("More pizza? Y/N");
        char choice = input.next().toUpperCase().charAt(0);
        if (choice=='Y'){
            order.incrementPizza();
            PizzaOrder newOrder = new PizzaOrder(getMyOrder());
            
            totalCost = totalCost+newOrder.finalCost();
            totalNumPizza = order.getPizza();
            pOrder();
        } 
        
    }
    //Get user input for pizza order
    public static Pizza getMyOrder(){
        boolean pepperoni, sausage, mushrooms;
        String p, s, m;
        String size;
        
        Scanner input = new Scanner(System.in);
            
        
        System.out.println("Please enter information for your pizza order:");
        
        //Get pepperoni topping order
        System.out.print("Enter 0 or pepperoni for pepperoni topping "); 
        String yourPepperoni = input.next();
        
        //Get sausage topping order
        System.out.print("Enter 0 or sausage for sausage topping ");
        String yourSausage = input.next();
        
        //Get mushrooms topping order
        System.out.print("Enter 0 or mushrooms for mushrooms topping ");
        String yourMushrooms = input.next();
        
        //Get size order
        System.out.print("Enter S, M, or L for small, medium, or large size of pizza ");
        char mySize = input.next().toUpperCase().charAt(0);
        
        
        String myPepperoni = "pepperoni";
        String mySausage = "sausage";
        String myMushrooms = "mushrooms";
        
        //User input pizza to create pizza order
        if (yourPepperoni.equals(myPepperoni))
            pepperoni = true;
        else
            pepperoni = false;
        
        if (yourSausage.equals(mySausage))
            sausage = true;
        else
            sausage = false;
        
        if (yourMushrooms.equals(myMushrooms))
            mushrooms = true;
        else 
            mushrooms = false;
        
        //User input to print out pizza order's sumary
        if(pepperoni == true)
            p = "pepperoni";
        else
            p = "";
        
        if(sausage == true)
            s = "sausage";
        else
            s = "";
        
        if(mushrooms==true)
            m = "mushrooms";
        else
            m = "";
        if((pepperoni==false)&&(sausage==false)&&(mushrooms==false))
            p = "no topping";
        
        if(mySize == 'S')
            size = "small";
        else if (mySize=='M')
            size = "medium";
        else 
            size = "large";
        
        //Print out order summary
        System.out.println("1 " + size + " pizza with " + p 
                + " " +  s + " " + m);
        
        //Pizza from user input
        Pizza pizzaOrder = new Pizza(pepperoni, sausage, mushrooms, mySize);
        return pizzaOrder;
        
        
    }
}
    
    


