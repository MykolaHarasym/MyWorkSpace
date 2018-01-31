package JavaPartTwoConstructor;
import  JavaPartOne.Intro.Dog;
public class TestArrays2 {
    String name;
    TestArrays2(String name){
        this.name = name;
        System.out.println("name is " + name);
    }

    public static void main(String[] args) {
        TestArrays2[] test = new TestArrays2[5];
        for (TestArrays2 i :test
             ) {
            i = new TestArrays2("Mary");
        }
        Dog dog = new Dog();

    }
}
