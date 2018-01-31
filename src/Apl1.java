public class Apl1 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i ++){
//            System.out.println(i);
//
//        }

        int []arr = {1,2,3,4,5,6,7,8,9};
        invertData(arr);
        for (int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }


        int a = 3;
        int b = 5;
        int tmp = 3;
        a = b;
        b = tmp;
        System.out.println( " a = " + a + " " + " b = " + b);



    }
  public static void invertData(int [ ] data){
        for (int i = 0; i < data.length/2; i ++){
        int tmp = data[i];
        data[i] = data[data.length - 1 - i];
        data[data.length - 1 - i] = tmp;
        }
        }
    }

