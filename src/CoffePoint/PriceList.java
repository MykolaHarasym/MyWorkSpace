package CoffePoint;

import java.util.ArrayList;
import java.util.LinkedList;

public class PriceList {

    public static LinkedList<Coffee> initialList(LinkedList<Coffee>  coffeeList){
        coffeeList = new LinkedList<>();
        Coffee coffeeWithMilkChocolateCream = new Coffee("Americano","Milk", "Chocolate", "Cream", 3.5);
        coffeeList.add(coffeeWithMilkChocolateCream);
        Coffee coffeeWithMilkChocolate = new Coffee("Americano","Milk", "Chocolate",  3.2);
        coffeeList.add(coffeeWithMilkChocolate);
        Coffee coffeeWithMilk = new Coffee("Americano","Milk",  2.8);
        coffeeList.add(coffeeWithMilk);
        Coffee coffee = new Coffee("Americano", 2.0);
        coffeeList.add(coffee);
        return coffeeList;
    }

    public static void main(String[] args) {
        LinkedList<Coffee> coffees = new LinkedList<>();
        System.out.println(initialList(coffees));
    }
}
