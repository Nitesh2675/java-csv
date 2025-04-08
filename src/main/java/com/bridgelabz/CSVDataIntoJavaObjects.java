package com.bridgelabz;


import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CSVDataIntoJavaObjects {
    public static void main(String[] args) {
        FileReader reader= null;
        try {
            reader = new FileReader("student.csv");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        CsvToBean<Student> csvToBean=new CsvToBeanBuilder<Student>(reader)
                .withType(Student.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        List<Student> students=csvToBean.parse();
        for(Student stu:students){
            System.out.println(stu.id()+" "+stu.name()+" "+ stu.age());
        }
    }
}
