package com.bridgelabz;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterRecord {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new FileReader("test.csv"))){
            String line;
            br.readLine();
            while((line=br.readLine())!=null){
                String[] colums=line.split(",");
                int marks=Integer.parseInt(colums[3]);
                if(marks>80){
                      for(int i=1;i< colums.length;i++){
                          System.out.printf("%-20s",colums[i]);
                      }
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
