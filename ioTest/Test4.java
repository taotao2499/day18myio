package ioTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myio2\\a.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        System.out.println(sb);

        //排序
        Integer[] arr = Arrays.stream(sb.toString()
                        .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        //写出
        FileWriter fw = new FileWriter("myio2\\a.txt");
        String s = Arrays.toString(arr).replace(",", "-");
        System.out.println(s);


    }
}
