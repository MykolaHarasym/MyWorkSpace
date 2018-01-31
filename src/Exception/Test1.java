package Exception;


import static com.sun.deploy.trace.Trace.print;

public class Test1 {
    public static void main(String[] args)  {
        try {
                throw new Exception("Someting go wrong");

        } catch (Exception e){
            e.printStackTrace(System.out);
            print("catch");
            print("get massage" + e.getMessage());
            print("get loc massage" + e.getLocalizedMessage());
            print("to string " + e);
            print("stack trace");
            e.printStackTrace(System.out);



        }
    }
}
