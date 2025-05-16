package bufferedstream;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            *
            需求:
            *
            利用字节缓冲流拷贝文件

            字节缓冲输入流的构造方法： public BufferedInputStream(InputStream is)
            字节缓冲输出流的构造方珐   public BufferedOutputStream(OutputStream os)
            */
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myio\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio\\copy.txt"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
