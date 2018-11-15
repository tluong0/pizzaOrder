/*
 * Pizza order class
 */
package newpackage;

/**
 *
 * @author trangluong
 */
public class PizzaOrder {
    private static int numPizzas;
    private static double finalCost;
    int number;
    Pizza myPizza = new Pizza();
    
public PizzaOrder(){
    
    Pizza myPizza = new Pizza();
}


public PizzaOrder(Pizza myPizza){
    this.myPizza = myPizza;
    
}

public void incrementPizza(){
    
    this.numPizzas++;
}


public int getPizza(){
    return this.numPizzas;
}



public double getCostFromSize(){
    if (myPizza.getSize() == 'S')
        return 8.00;
    else if (myPizza.getSize() == 'M')
        return 10.00;
    else if (myPizza.getSize() == 'L')
        return 12.00;
    return 0.00;
}
public double getCostFromPepperoni(){
    if (myPizza.getPepperoniTopping() == 1)
        return 1.00;
    else
        return 0.00;
}

public double getCostFromSausage(){
    if (myPizza.getSausageTopping() == 1)
        return 1.00;
    else
        return 0.00;
}


public double getCostFromMushrooms(){
    if (myPizza.getMushroomsTopping() == 1)
        return 1.00;
    else
        return 0.00;
}

//Total cost from topping
public double totalTopping(){
    return getCostFromPepperoni() + getCostFromSausage() + getCostFromMushrooms();
}

//Final cost for 1 pizza order
public double finalCost(){
    finalCost = getCostFromSize()+totalTopping();
    
    return this.finalCost;
}

//Final cost after order all pizzas
public double updateFinalCost(PizzaOrder pizza){
    
    finalCost = finalCost + pizza.finalCost();
    
    return this.finalCost;
}
}




