package JavaPartTwoConstructor;

import java.util.Arrays;
import java.util.Random;

public class TestArrays {
    public static void main(String[] args) {
        Random random = new Random(47);
        int [] a = new int[15];
        for(int i = 0; i < a.length; i ++){
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
    }
}
