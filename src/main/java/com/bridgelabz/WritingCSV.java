package com.bridgelabz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingCSV {
    public static void main(String[] args) {
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("write.csv"))){
            bw.write("ID,NAME,DEPARTMENT,SALARY\n");
            bw.write("1,Nitesh,CSE,70000\n");
            bw.write("2,Kartik,Fauj,70001\n");
            bw.write("3,Addi,MCA,70002\n");
            bw.write("4,Vishal,BE,70003\n");
            bw.write("5,Banga,SBI,70004\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
