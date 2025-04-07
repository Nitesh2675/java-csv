package com.bridgelabztest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Validation {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new FileReader("employee.csv"))){
            String line;
            while((line=br.readLine())!=null){
                String[] colums=line.split(",");
                if(!colums[3].matches("\\d+")){
                    System.out.println("invalid salary of "+colums[1]);
                }
            }
        } catch (RuntimeException | FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
