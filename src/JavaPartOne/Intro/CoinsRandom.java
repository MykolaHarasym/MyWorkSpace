package JavaPartOne.Intro;

import java.util.Random;

public class CoinsRandom {
    public static void main(String[] args) {
        throwCoin();
        throwCoin();
        throwCoin();
    }

    public static void throwCoin(){
        Random random = new Random();
        int throwCoins = random.nextInt(2);
        if (throwCoins == 0){
            System.out.println("решка");
        } else System.out.println("Орел");
    }
}
