package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses="";
    private int tuitionBalance=0;
    private String studentID;
    private static int costOfCourse=600;
    private static int id = 1000;

    
    //constructor : prompt user to enter student name
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student's First Name : ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student's Last Name : ");
        this.lastName = in.nextLine();

        System.out.println("Enter Student's Grade Level : ");
        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student's Class Level : ");
        this.gradeYear = in.nextInt();

        setStudentID();
        System.out.println();
        System.out.println("Name : " + firstName + " " + lastName +
               "\nGrade Year : " + gradeYear +
               "\nStudent ID : " + studentID);
        System.out.println();       

    }

    //Generate an ID
    private void setStudentID(){
         //gradelevel + staticID
         id++;
         this.studentID = gradeYear + "" + id;
    }


    //Enroll in Courses
    public void enroll(){
        //get inside a loop , users hits 0
      do{  
        System.out.print("Enter course to enroll ( or Q to quit) : ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if(!course.equals("Q")) {
            courses = courses + "\n  " + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        }else { 
            break; 
        }
      }while( 1!=0);  
        System.out.println();
        System.out.println("Enrolled In : " + courses);
        System.out.println();
    }

    //View Balance
    public void viewBalance(){
        System.out.println("Your Balance is $" + tuitionBalance);
    }

    //Pay Tution
    public void payTuition(){
        viewBalance();
        System.out.print("Enter the Payment : $");
        Scanner in =  new Scanner(System.in);
        int payment  = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank You for your payment of $" + payment);
        viewBalance();
        System.out.println();
    }


    //show Status
    public String showInfo(){
        return "Your Status :- \n Name : " + firstName + " " + lastName +
               "\n Grade Year : " + gradeYear +
               "\n Student ID : " + studentID +
               "\n Courses Enrolled : " + courses +
               "\n Balance : $" + tuitionBalance + "\n";
               
               

    }
}
