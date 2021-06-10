package com.example.javafundamental.inputouputstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("D:\\dicoding\\java-projects\\DasarJava\\src\\com\\example\\javafundamental\\inputouputstream\\latihan_input.txt");
            out = new FileWriter("D:\\dicoding\\java-projects\\DasarJava\\src\\com\\example\\javafundamental\\inputouputstream\\latihan_ouput.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

/*

 */