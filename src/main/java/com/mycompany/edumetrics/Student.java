
package com.mycompany.edumetrics;

abstract class Student {
    String name;
    String id;
    double cgpa;
    int semester;

    Student(String name, String id, int semester) {
        this.name = name;
        this.id = id;
        this.semester = semester;
    }

    // Abstract method for waiver calculation
    abstract void calculateWaiver();

    // Method overloading: calculate CGPA for 2 subjects
    void calculateCGPA(double g1, double g2) {
       
        this.cgpa = (g1 + g2) / 2;
        System.out.println(cgpa);
    }

    // Method overloading: calculate CGPA for multiple subjects
    void calculateCGPA(double[] grades) {
        double total = 0;
        for (double g : grades) {
            total += g;
        }
        double CGPA;
        this.cgpa = total / grades.length;
       System.out.println(cgpa);    }

    // Display info
    void displayInfo() {
        System.out.println("\nStudent Info:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
    }
}