package JavaPartThree.Inher1;

public class B extends A {
    B (){
        super();
    }

    B(String name){
        super();
        this.name = name;
        System.out.println("Constructor B" + name);
    }
}
