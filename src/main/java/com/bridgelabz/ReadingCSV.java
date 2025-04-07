package com.bridgelabz;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingCSV {
    public static void main(String[] args) {
    try(BufferedReader br=new BufferedReader(new FileReader("test.csv"))){
          String line;
          while((line=br.readLine())!=null){
              String[] row=line.split(",");
              for(String i:row){
                  System.out.printf("%-20s",i);
              }
              System.out.println();
          }
  } catch (Exception e) {
        System.out.println(e.getMessage());
 }

    }
}
