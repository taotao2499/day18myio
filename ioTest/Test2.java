package ioTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //加密
        FileInputStream fis = new FileInputStream("D:\\test1\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\test1\\a.txt");
        int b;
        while ((b = fis.read())!= -1) {
            fos.write(b^123);
        }
        fis.close();
        fos.close();



    }
}
