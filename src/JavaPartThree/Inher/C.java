package JavaPartThree.Inher;

public class C extends A {
    C(String name){
        super(name);
        System.out.println("constructor C");
    }

    public static void main(String[] args) {
       C c = new C("qqq");
    }
}
