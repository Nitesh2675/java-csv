package com.bridgelabz;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAndCount {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new FileReader("test.csv"))){
            String line;
            int c=0;
            while((line= br.readLine())!=null){
                c++;
            }
            System.out.println(c-1) ;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
