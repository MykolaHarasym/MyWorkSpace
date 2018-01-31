package JavaPartTwoConstructor;

public class Test2 {
    String name;
    Test2(){
        System.out.println(" Hello world");
    }

    Test2(String name){
        this.name = name;
        System.out.println("Name is " + name);
    }

    public static void main(String[] args) {
        Test2 test = new Test2();
        Test2 test2 = new Test2("Jon");

    }
}
