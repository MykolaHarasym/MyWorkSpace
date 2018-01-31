package JavaPartOne.Intro;

public class Fibonachi {
    public static void main(String[] args) {
        int [] a = new int [20];
        a[0] = 1;
        a[1] = 1;
        for (int i = 0; i < a.length; i ++ ){
            if (i > 2)
            {
                a[i] = a[i - 2] + a[i -1];
            }
            System.out.println(a[i]);
        }
    }
}
