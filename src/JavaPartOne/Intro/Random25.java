package JavaPartOne.Intro;

import java.util.Random;

public class Random25 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int k = 0;
        int j = 0;
        for (int i = 0; i < 25; i ++){
            j = rand.nextInt(10);
            System.out.println(i);
            k = rand.nextInt(10);
            if (j>k){
                System.out.println(j + " more " + k);
            } else if (j<k){
                System.out.println(j + " less " +k);
            } else {
                System.out.println( j + " equal " + k);
            }
            System.out.println("--------------------");
        }
    }
}
