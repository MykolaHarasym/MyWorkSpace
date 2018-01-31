import java.sql.Array;
import java.util.Arrays;

public class SortApi {
    public static void main(String[] args) {

        int[]arr = {1,5,7,9,3,6,8,7,1,2,8,7,5,};

        for (int i = 0; i < arr.length-1; i ++){
            for ( int k = 0; k < arr.length - 1; k ++){
                sortArray(arr, k, k +1);
            }
        }
        System.out.println(Arrays.toString(arr));

        rec(5);
    }

    public static void sortArray(int[]arr, int frt, int sec){
        if (arr[frt]>arr[sec]) {
            int tmp = arr[frt];
            arr[frt] = arr[sec];
            arr[sec] = tmp;
        }
    }



    public  static void rec(int N){
        if (N!=0){
            System.out.println(N);
            rec(N-1);
        } else {
            System.out.println(0);
        }
    }
}
