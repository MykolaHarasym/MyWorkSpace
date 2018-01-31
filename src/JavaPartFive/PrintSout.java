package JavaPartFive;

public class PrintSout extends Sout {

    int value= 0;
    @Override
    public void print() {

        System.out.println(value);
    }
    PrintSout(){
        super();
        print();
    }
}
