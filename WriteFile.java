package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteFile {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos =new FileOutputStream("newTextFile.txt");
        PrintWriter pw = new PrintWriter(fos);


        pw.println("Pierwsza linijka");
        pw.println("Druga linijka");
    }
}
