package com.bridgelabztest;

public class A {

    int age;
    String name;
    static A instance;

    private A(int age, String name) {
        this.age = age;
        this.name = name;
    }

    static A getInstnace(){
       if(instance==null){
           instance=new A(10,"yup");
       }
       return instance;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
