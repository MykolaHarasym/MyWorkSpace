package Exception;

public class ArrayEx {
    public static void main(String[] args) {
        int [] arr = new int[15];

       try{
           for (int i = 0; i < 16; i ++){
               arr[i] = i;
               System.out.println("i: " + i);
           }
       } catch (IndexOutOfBoundsException e ){
           e.printStackTrace(System.out);
       }
    }
}
