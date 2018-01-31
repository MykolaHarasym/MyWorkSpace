package CoffePoint;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        PriceList list = new PriceList();
        LinkedList<Coffee> coffees = new LinkedList<>();
        list.initialList(coffees);
        System.out.println(coffees);
    }

}
