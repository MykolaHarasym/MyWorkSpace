package Exception;

public class TestMyException {

    public static void g() throws MyException{
        System.out.println("Error in g()");
        throw new MyException();
    }

    public static  void f ()throws  MyException{
        System.out.println("Error in f()");
        throw new MyException("With param");
    }
    public static  void c() throws MyException{
        g();
    }

    public static void main(String[] args) throws MyException {
        try {
            c();
        } catch (MyException e){
            for(StackTraceElement str: e.getStackTrace()){
                System.out.println(str.getClassName());
            }

        }

//        try {
//            f();
//        } catch (MyException e){
//            e.printStackTrace(System.out);
//        }


    }
}
