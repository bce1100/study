package com.ljj.io;

import java.io.*;

/**
 * Created by bce1100 on 2018/7/13.
 */
public class Stream {
    public static void main(String[] args) {
        try {
//            FileInputStream fis = new FileInputStream("hey.txt");
//            byte input[]=new byte[24];
//            fis.read(input);
//            String str = new String(input);
//            System.out.println(str);
//            FileOutputStream fos = new FileOutputStream("hey.txt");
//            byte output[] = "看看覆ddd盖了多少safasf".getBytes("UTF-8");
//            fos.write(output);
//            fos.flush();
//            fos.close();
//            FileInputStream fis = new FileInputStream("培训计划.png");
//            FileOutputStream fos = new FileOutputStream("培训计划_copy.png");
//            byte input[] = new byte[50];
//            while(fis.read(input)!=-1){
//                fos.write(input);
//            }
//            fos.flush();
//            fos.close();
//            fis.close();
//            System.out.println("ok");
            FileInputStream fis = new FileInputStream("hey.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            FileOutputStream fos = new FileOutputStream("hey_copy.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
//            char[]cbuf=new char[30];
//            int l = 0;
//            while((l=isr.read(cbuf))!=-1){
////                System.out.println(new String(cbuf,0,l));
//                osw.write(cbuf);
//            }
            BufferedReader br = new BufferedReader(isr);
//            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(osw,true);
            String input;
            while((input = br.readLine())!=null){
//                bw.write(input);
                pw.println(input);
            }
//            pw.flush();
            br.close();
//            bw.close();
            pw.close();
            isr.close();
            fis.close();
            osw.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
