package com.example.javafundamental.inputouputstream;

import java.io.File;

public class FileNavigation {
    public static void main(String args[]) {
        String dirname = "D:\\dicoding\\java-projects\\DasarJava\\src\\com\\example\\javafundamental\\inputouputstream";
        File file = null;
        String[] paths;

        try{
            file = new File(dirname);
            paths = file.list();
            for (String path : paths){
                System.out.println(path);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
