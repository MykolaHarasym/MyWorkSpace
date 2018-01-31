package IOJava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class App1 {
    public static void main(String[] args) throws  IOException{

        InputStream src = new URL("http://dom2.ru").openStream();
        OutputStream dst = new FileOutputStream("file txt");
        copy(src, dst);

    }

    public static void copy(InputStream src, OutputStream dst) throws IOException{
        while (true){
            int data = src.read();
            if (data != -1){
                dst.write(data);
            } else return;
        }
    }public static void copyBuff(InputStream src, OutputStream dst) throws IOException{
        byte [] buff = new byte[1024*64];
        while (true){
            int count = src.read(buff);
            if (count != -1){
                dst.write(buff,0, count);
            } else return;
        }
    }
}
