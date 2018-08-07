package com.ljj;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File file = new File("hey.txt");
        if(file.exists()){
//            System.out.println(file.isFile());
//            System.out.println(file.isDirectory());
//            file.delete();
            File renameTo = new File("hey man.txt");
            file.renameTo(renameTo);
        }else{
            System.out.println("file doesn't exists");
            try {
                file.createNewFile();
                System.out.println("file create successfully");
            } catch (IOException e) {
                System.out.println("file can't be created");
            }
        }
    }
}
