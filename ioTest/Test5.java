package ioTest;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("myio2\\count.txt"));
        String s = br.readLine();
        br.close();
        int count = Integer.parseInt(s);
        count ++;

        //2.判断
        if (count <= 3){
            System.out.println("欢迎使用本软件，第"+count + "次使用免费");
        }else {
            System.out.println("本软件只能免费使用三次，欢迎您注册会员后继续使用");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("myio2\\count.txt"));
        bw.write(count + "");
        bw.close();


    }
}
