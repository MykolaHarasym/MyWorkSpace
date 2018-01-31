package JavaPartTwoConstructor;

public class Test3 {

    public void Car (){
     StartEngin(new Test3());
     StartEngin(this);
    }
    public Test3 StartEngin (Test3 engin){
        System.out.println("Start engin");
    return engin;
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.Car();
    }
}
