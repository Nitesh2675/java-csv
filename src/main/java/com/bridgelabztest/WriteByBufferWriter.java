package com.bridgelabztest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteByBufferWriter {
    public static void main(String[] args) {
        //String abc="output.csv";
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("output.csv",true))){
            bw.write("name,id\n");
            bw.write("praveen 2111981093\n");
            bw.write("dhruv,2111981075\n");
            bw.write("akshit,2111981075\n");
            bw.write("ankush,2111981075\n");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
