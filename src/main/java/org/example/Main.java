package org.example;

public class Main {
    public static void main(String[] args){

    student firstStudent = new student();
    // das ist der standart konstruktur student firstStudent = new student();
    firstStudent.setFirstname("Max");
    firstStudent.setSurname("Mustermann");
    firstStudent.setStudentID(2022297);

    System.out.println(firstStudent.getfirstName());
    System.out.println(firstStudent.getSurname());
    System.out.println(firstStudent.getStudentID());


    }



}