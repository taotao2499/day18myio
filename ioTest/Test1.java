package ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件

        //1.创建流对象
        File src = new File("D:\\test1");
        File dest = new File("D:\\test2");
        //2.调用方法
        copyDir(src, dest);

    }

    private static void copyDir(File src, File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        //3.遍历数组
        for (File file : files) {
            if (file.isFile()) {
                //4.判断是文件，就拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                //5.释放资源
                fis.close();
                fos.close();
            }else {
                //5.判断是目录，就递归
                copyDir(file, new File(dest, file.getName()));
            }
        }
    }
}
