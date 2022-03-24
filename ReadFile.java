package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("TextFile.txt");
        Scanner in = new Scanner(fis);

        while (in.hasNext()){
            System.out.println(in.nextLine());
        }
    }
}
