# EduMetrics: CGPA & Waiver Calculator

## 📱🧠 Overview
EduMetrics is a Java-based educational tool designed to help students calculate their CGPA (Cumulative Grade Point Average) and determine tuition waiver eligibility. The application supports both undergraduate and graduate students with different waiver criteria.

## 👨‍💻 Developer Abed Hossain
  
## ✨ Features
- **User Authentication**: Simple password-based login system
- **Student Type Classification**: Supports both undergraduate and graduate students
- **CGPA Calculation**: 
  - Can calculate CGPA for any number of courses
  - Shows accurate CGPA based on input grades
- **Tuition Waiver Calculation**:
  - **Undergraduate Waiver Criteria**:
    - 100% waiver for CGPA ≥ 3.70
    - 60% waiver for CGPA ≥ 3.60
    - 40% waiver for CGPA ≥ 3.40
    - No waiver for CGPA < 3.40
  - **Graduate Waiver Criteria**:
    - 100% waiver for CGPA ≥ 3.80
    - 60% waiver for CGPA ≥ 3.70
    - 40% waiver for CGPA ≥ 3.50
    - No waiver for CGPA < 3.50

## 🛠️ Technical Implementation
- **Object-Oriented Programming**:
  - Abstract class for `Student`
  - Inheritance for `UndergraduateStudent` and `GraduateStudent`
  - Method overriding for specialized behavior
  - Method overloading for flexible CGPA calculations
- **User Input Handling**: Robust Scanner implementation
- **Iterative Processing**: Supports calculating multiple students in one session

## 🚀 How to Run
1. Ensure you have Java installed (Java 23 required as per project configuration)
2. Clone this repository
3. Open the project in NetBeans or your preferred Java IDE
4. Build and run the project
5. When prompted, use the password: `seu` to log in

## 📝 Usage Example
```
===== 👋😊Welcome to EduMetrics👋😊=====
===== 📱🧠 CGPA & Waiver Calculator📱🧠  =====
=====Developed By Abed Hossain=====

Enter your password: seu

✅ Login Successful!✅ 

Enter Student Type (1 = Undergraduate, 2 = Graduate): 1
Enter Name: John Doe
Enter ID: SE12345
Enter Semester: 3
Enter number of courses: 3
Enter grade for course 1: 3.7
Enter grade for course 2: 3.8
Enter grade for course 3: 3.9
3.8

Student Info:
Name: John Doe
ID: SE12345
Semester: 3
CGPA: 3.8
Tuition Waiver: 100% 

🔁 Do you want to calculate again? (yes/no): no
👋 Thank you for using EduMetrics! Goodbye!
```

## 📚 Project Structure
- `Student.java`: Abstract base class with common functionality
- `UndergraduateStudent.java`: Specialized class for undergraduate students
- `GraduateStudent.java`: Specialized class for graduate students
- `EduMetrics.java`: Main application with user interface

## 🔮 Future Enhancements
- GUI implementation
- Database integration for student records
- Additional metrics beyond CGPA
- More sophisticated authentication system
- Course credit weighting for CGPA calculation

## 📄 License
This project is for educational purposes. Feel free to use and modify as needed.

---

© 2025 EduMetrics | Southeast University
