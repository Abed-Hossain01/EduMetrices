package com.mycompany.edumetrics;
import java.util.Scanner;

public class EduMetrics {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
        System.out.println("===== 👋😊Welcome to EduMetrics👋😊=====");
        System.out.println("===== 📱🧠 CGPA & Waiver Calculator📱🧠  =====");
        System.out.println("=====Developed By Abed Hossain ====");
        
       
        String k = " ";

        // password is seu
         while (!"seu".equals(k)) {
         System.out.print("Enter your password: ");
         k = sc.nextLine();

      if (!"seu".equals(k)) {
        System.out.println("❎ACCESS DENIED❎ ");
        System.out.println("🚫 WRONG PASSWORD !!! TRY AGAIN🚫\n");
        }
        }

        System.out.println("\n✅ Login Successful!✅ \n");
        
         String choice;

        do {

        System.out.print("Enter Student Type (1 = Undergraduate, 2 = Graduate): ");
        int type = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Semester: ");
        int semester = sc.nextInt();

        Student student;

        if (type == 1) {
            student = new UndergraduateStudent(name, id, semester);
        } else {
            student = new GraduateStudent(name, id, semester);
        }

        System.out.print("Enter number of courses: ");
        int numCourses = sc.nextInt();
        double[] grades = new double[numCourses];

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter grade for course " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }

      
        if (numCourses == 2) {
           student.calculateCGPA(grades[0],grades[1]);
        } else {
           student.calculateCGPA(grades);
        }

        student.displayInfo();

        student.calculateWaiver();
        
        sc.nextLine(); 
            System.out.print("🔁 Do you want to calculate again? (yes/no): ");
            choice = sc.nextLine().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("👋 Thank you for using EduMetrics! Goodbye!");

        }
       
    
}
