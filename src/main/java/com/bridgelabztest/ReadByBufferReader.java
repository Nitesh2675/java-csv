package com.bridgelabztest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadByBufferReader {
    public static void main(String[] args) {
        String filepath="test.csv";
        try(BufferedReader br=new BufferedReader(new FileReader(filepath)))
        {
        String line;
        while((line=br.readLine())!=null){
            String[] colums=line.split(",");
            System.out.println("id " +colums[0] +",name "+colums[1]);
        }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
