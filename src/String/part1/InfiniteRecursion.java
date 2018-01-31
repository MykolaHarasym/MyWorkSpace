package String.part1;

import sun.awt.util.IdentityArrayList;

import java.util.List;

public class InfiniteRecursion {
    public String toString(){
        return "InfiniteRecursion" + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> list = new IdentityArrayList<>();
        for (int i = 0; i <10; i ++){
            list.add(new InfiniteRecursion());
        }
        System.out.println(list);
    }
}
