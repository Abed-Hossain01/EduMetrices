
package com.mycompany.edumetrics;

class GraduateStudent extends Student {

    GraduateStudent(String name, String id, int semester) {
        super(name, id, semester);
    }

    // Method overriding
    @Override
     void calculateWaiver() {
        if (cgpa >= 3.80) {
            System.out.println("Tuition Waiver: 100% ");
        }
        else if (cgpa >= 3.70) {
            System.out.println("Tuition Waiver: 60% ");
        }
        else if (cgpa >= 3.50) {
            System.out.println("Tuition Waiver: 40% ");
        }
        else {
            System.out.println("There will be no waiver ");
        }
    }
    @Override
    void displayInfo() {
        System.out.println("\nStudent Info:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
    }
}