package Exception;

public class Test2 {
    public static void main(String[] args) throws Exception{
        try{
            System.out.println("Before");
            throw new Exception("Something go wrong");
        } catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
}
