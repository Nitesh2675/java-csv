package com.bridgelabztest;

import com.opencsv.CSVWriter;

import java.io.FileWriter;

public class WriteByCsvWriter {
    public static void main(String[] args) {
        try(CSVWriter writer=new CSVWriter(new FileWriter("output.csv",true))){
            String[] data1={"nitesh","2111981136"};
            String[] data2={"Kartik","2111981097"};
            writer.writeNext(data1);
            writer.writeNext(data2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
