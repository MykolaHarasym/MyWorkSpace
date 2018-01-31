package Collections.Collection1;

import java.util.ArrayList;

public class Test {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList <Apple> list = new ArrayList<>();
        for(int i = 0; i  < 3 ; i ++){
            list.add(new Apple());
        }

        for(int i = 0; i< list.size(); i ++){
            list.get(i).Id();
        }
    }
}
