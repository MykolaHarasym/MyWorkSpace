public class SortArray {

    public static void threeMaj(int[] arr){
        int firstI, secondI, thirdI;
        firstI = 0;
        secondI = 0;
        thirdI = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[secondI] && arr[i] > arr[thirdI]) {
                thirdI = i;

            }
            if(arr[i] < arr[firstI] && arr[i] > arr[secondI]) {
                thirdI = secondI;
                secondI = i;

            }
            if(arr[i] > arr[firstI]) {
                thirdI = secondI;
                secondI = firstI;
                firstI = i;
            }
            System.out.println("First el. = " + arr[firstI]);
            System.out.println("Second el. = " + arr[secondI]);
            System.out.println("Third el. = " + arr[thirdI]);
            System.out.println("First ind. = " + firstI);
            System.out.println("Second ind. = " + secondI);
            System.out.println("Third ind. = " + thirdI);
            System.out.println("-------------------");
        }


    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 3, 7, 4, 9, 1, 3, 2, 8};

        threeMaj(arr);

    }
}
