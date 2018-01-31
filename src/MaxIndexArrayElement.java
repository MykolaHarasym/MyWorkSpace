public class MaxIndexArrayElement {

    public static void sort(int [] arr){
        int indexOfMaxElement = 0;
        int secondIndexOfMaxElement = 0;
        int thirdIndexOfMaxElement = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]<arr[secondIndexOfMaxElement] && arr[i]>arr[thirdIndexOfMaxElement]) {
                thirdIndexOfMaxElement = i;
            }

            if (arr[i]<arr[indexOfMaxElement] && arr[i]> arr[secondIndexOfMaxElement]){
                thirdIndexOfMaxElement = secondIndexOfMaxElement;
                secondIndexOfMaxElement = i;
            }
            if (arr[i] > arr[indexOfMaxElement]){
                thirdIndexOfMaxElement = secondIndexOfMaxElement;
                secondIndexOfMaxElement = indexOfMaxElement;
                indexOfMaxElement = i;
            }
            }


        System.out.println("First max index = " + indexOfMaxElement);
        System.out.println("Second max index = " + secondIndexOfMaxElement);
        System.out.println("Third max index = " + thirdIndexOfMaxElement);


    }


    public static void sort1(int [] arr){
        int indexOfMinElement = 0;
        int secondIndexOfMinElement = 0;
        int thirdIndexOfMinElement = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            if (arr[i]>arr[secondIndexOfMinElement] && arr[i]<arr[thirdIndexOfMinElement]) {
                thirdIndexOfMinElement = i;
            }

            if (arr[i]>arr[indexOfMinElement] && arr[i]< arr[secondIndexOfMinElement]){
                thirdIndexOfMinElement = secondIndexOfMinElement;
                secondIndexOfMinElement = i;
            }
            if (arr[i] < arr[indexOfMinElement]){
                thirdIndexOfMinElement = secondIndexOfMinElement;
                secondIndexOfMinElement = indexOfMinElement;
                indexOfMinElement = i;
            }
        }


        System.out.println("First min index = " + indexOfMinElement);
        System.out.println("Second min index = " + secondIndexOfMinElement);
        System.out.println("Third min index = " + thirdIndexOfMinElement);
    }

    public static void main(String[] args) {
        int arr[] = {177, 45  ,84, 3, 1 , 107, 5, 14, 256, 22, 13, 7, 9, 10, 11};
        sort1(arr);

    }
}
