package JavaPartTwoConstructor;

public class Initial {
    String name = "Jon";
    int age;
    Initial(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Initial in = new Initial(21);
        System.out.println(in.name + " " + in.age);
    }
}
