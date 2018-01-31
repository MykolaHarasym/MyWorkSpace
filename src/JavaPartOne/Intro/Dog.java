package JavaPartOne.Intro;

public class Dog {
    String name;
    String say;

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "Lacky";
        spot.say = "wow wow";
        System.out.println("spot.name = " + spot.name + ", " + "spot.say = " + spot.say);
        Dog scruffy = new Dog();
        scruffy.name = "Jack";
        scruffy.say = "gay gay";
        System.out.println("scruffy.name = " + scruffy.name + ", " + "scruffy.say = " + scruffy.say);
        Dog bars = spot;
        System.out.println(bars==spot);
        System.out.println(bars.equals(spot));
    }
}
