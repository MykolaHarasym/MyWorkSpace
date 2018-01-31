import java.util.Arrays;

public class SortApi1 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,6,5,7,7,9,4,2,2,3,6,4,7,8,9,5,15,};
        for (int i = 0; i < arr.length-1; i ++){
            for (int j = i +1; j <arr.length; j++){// try j = 0; j < arr.length-1
                if (arr[j]> arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }


}
