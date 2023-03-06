package model;

import java.util.Objects;

public class student {


    public student (int studentID, String firstname, String surname) {
        this.studentID = studentID;
        this.firstname = firstname;
        this.surname = surname;
        System.out.println("A new student has been addded");
    }
    private int studentID;
    private String firstname;
    private String surname;

    public int getStudentID(){
        return studentID;

    }

    public void setStudentID (int studentID){
        this.studentID = studentID;

    }


    public String getfirstName(){
        return firstname;

    }

    public void setFirstname (String newFirstname){
        firstname = newFirstname;

    }

    public String getSurname(){
        return surname;

    }

    public void setSurname (String newSurname){
        surname = newSurname;

    }

      public String toString (){
        return firstname + " " + surname + " " + studentID;

      }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof student student)) return false;

        if (getStudentID() != student.getStudentID()) return false;
        if (!Objects.equals(firstname, student.firstname)) return false;
        return getSurname() != null ? getSurname().equals(student.getSurname()) : student.getSurname() == null;
    }

    @Override
    public int hashCode() {
        int result = getStudentID();
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        return result;
    }
}
