package IOJava;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class LogOS extends OutputStream {

    private final OutputStream impl;
    private final String name;

    LogOS(String name, OutputStream impl){
        this.name = name;
        this.impl = impl;

    }

    @Override
    public void write(int b) throws IOException {
        System.out.println(name + " Write( " + b + " )");
    impl.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        System.out.println(name + " Write( " + Arrays.toString(b) + " )");
        impl.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        System.out.println(name + " Write( " + Arrays.toString(b) + " )" + ", " + off + ", " + len);
        impl.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        impl.flush();
    }

    @Override
    public void close() throws IOException {
        impl.close();
    }
}
