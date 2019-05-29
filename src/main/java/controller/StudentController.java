package controller;

import entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> list = new ArrayList<Student>();
    public void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter EnrolID: ");
        String EnrollID = scanner.nextLine();
        System.out.println("Enter Firstname: ");
        String FirstName = scanner.nextLine();
        System.out.println("Enter Lastname: ");
        String LastName = scanner.nextLine();
        System.out.println("Enter Age: ");
        String Age = scanner.nextLine();
        Student student = new Student(EnrollID, FirstName, LastName,Age);
        list.add(student);
    }
    public void saveStudent() throws IOException {
        FileWriter fileWriter = new FileWriter("src/main/resources/Students.dat");
        fileWriter.write("EnrolID\t"+"        "+ "FullName\t"+"         "+ "Age"+ "\n");
        fileWriter.write("--------"+"     "+"---------------------"+"     "+"------\n");
        for (Student student:
                list) {
            fileWriter.write(student.getEnrolID() + "        " + student.getFirstName()+" "+student.getLastName()+"       "+student.getAge()+ "\n");
        }
        fileWriter.close();
    }
    public void listStudent()throws IOException{
        FileReader fileReader = new FileReader("src/main/resources/Students.dat");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while( (line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }
}
