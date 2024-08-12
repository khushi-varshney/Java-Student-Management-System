package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    
    public static void main(String[] args) {
        
        //Ask how many new students we want to add
        System.out.print("Enter the number of new students to enroll : ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();

        //Create n number of new Students
        Student[] students =  new Student[numOfStudents];
        for(int i=0;i<numOfStudents;i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].showInfo());
        }
        for(int i =0;i<numOfStudents;i++){
            System.out.println(students[i].showInfo());
        }
    }
}
