package com.bridgelabztest;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ReadByCsvReader {
    public static void main(String[] args) {
        try(CSVReader reader=new CSVReader(new FileReader("test.csv"))){
            String[] array;
            while((array=reader.readNext())!=null){
                System.out.println("ID " + array[0]+",nameww "+array[1]);
            }
        } catch (IOException | CsvValidationException e) {
            System.out.println(e.getMessage());
        }

    }
}
