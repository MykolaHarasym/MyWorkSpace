package IOJava;

import java.io.*;

public class App2 {
    public static void main(String[] args) throws IOException {
        OutputStream dst = new FileOutputStream("file1.txt");
        dst = new LogOS("After" , dst);
        dst = new BufferedOutputStream(dst, 2);
        dst = new LogOS("Before" , dst);
        dst.write(1);
        dst.write(2);
        dst.write(3);
        dst.write(4);
        dst.write(5);
        dst.flush();
    }
}
