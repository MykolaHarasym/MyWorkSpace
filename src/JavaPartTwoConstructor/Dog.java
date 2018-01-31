package JavaPartTwoConstructor;

public class Dog {
    String name;
    int age;
    Dog(String name){
        this.name = name;
    }
    Dog(String name, int age){
        this(name);
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Marlie" , 2);
        System.out.println(dog.name + " " + dog.age);
    }
}
