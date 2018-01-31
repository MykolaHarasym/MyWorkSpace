package Exception;

public class Step {

    static int count = 1;
    static int number = 2;
    public  static void power(int k){
        if(k == number) {
            System.out.println("true");
            count = 1;
            number = 2;
        }else if(count < 32){
            count++;
            number *= 2;
            power(k);
        }else{
            System.out.println("false");
        }
    }


    public  static  void power2(int k ){
        if (k==2){
            System.out.println(true);
        }  else if (true){
            number*=2;
            power2(k);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {

        power2(512);
        power2(2);
        power2(4);
        power2(8);
        power2(10);
    }
}
