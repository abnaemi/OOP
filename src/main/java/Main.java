import model.student;

public class Main {
    public static void main(String[] args){

    student firstStudent = new student(23332423, "Tom", "Sawyer");
    // das ist der standart konstruktur student firstStudent = new student();
//    firstStudent.setFirstname("Max");
//    firstStudent.setSurname("Mustermann");
//    firstStudent.setStudentID(2022297);

    System.out.println(firstStudent.getfirstName());
    System.out.println(firstStudent.getSurname());
    System.out.println(firstStudent.getStudentID());
        System.out.println(firstStudent.toString());

        student firstStudent2 = new student(233324233, "Tom", "Sawyer");


      if (firstStudent.equals(firstStudent2)){
          System.out.println("Student already exists");
      } else {
          System.out.println("Students are different");
    }



}}