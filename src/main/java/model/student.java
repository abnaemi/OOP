package model;

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

}
