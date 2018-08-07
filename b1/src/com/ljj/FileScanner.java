package com.ljj;

import java.io.File;

/**
 * Created by bce1100 on 2018/7/12.
 */
public class FileScanner {
    public static void main(String[] args) {
        File file = new File("D:/idea_station/b1");
        System.out.println("根目录"+file.getName());
        scannerFile(file, 1);
    }

    public static void scannerFile(File dir, int tab) {
        if (dir.isDirectory()) {
            File[] next = dir.listFiles();
            for (int i = 0; i < next.length; i++) {
                for (int j = 0; j < tab; j++) {
                    System.out.print("    ");
                }
                System.out.println(next[i].getName());
                if (next[i].isDirectory()) {
                    scannerFile(next[i], tab + 1);
                }
            }
        }
    }
}
