package com.bridgelabztest;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;



public class CsvDataIntoJavaObjects {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader=new FileReader("employee.csv");
        CsvToBean<Employee> csvtobean=new CsvToBeanBuilder<Employee>(reader)
                .withType(Employee.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        List<Employee> employees=csvtobean.parse();
        for(Employee emp:employees){
            System.out.println(emp.getName()+" works in "+emp.getDepartment());
        }
    }
}
