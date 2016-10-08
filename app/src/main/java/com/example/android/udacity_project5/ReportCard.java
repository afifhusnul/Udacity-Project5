package com.example.android.udacity_project5;

/**
 * Created by NUSNAFIF on 10/7/2016.
 */

public class ReportCard {

    // Icons of Students
    private int ImageIcon;
    // Students Name
    private String StudentName;
    // Students Subject
    private String StudentSubject;
    // Students grade
    private String StudentsGrade;


    public int getImageIcon() {
        return ImageIcon;
    }

    public void setImageIcon(int imageIcon) {
        ImageIcon = imageIcon;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentSubject() {
        return StudentSubject;
    }

    public void setStudentSubject(String studentSubject) {
        StudentSubject = studentSubject;
    }

    public String getStudentsGrade() {
        return StudentsGrade;
    }

    public void setStudentsGrade(String studentsGrade) {
        StudentsGrade = studentsGrade;
    }

    public ReportCard(int imageIcon, String studentName, String studentSubject, String studentsGrade) {
        ImageIcon = imageIcon;
        StudentName = studentName;
        StudentSubject = studentSubject;
        StudentsGrade = studentsGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "ImageIcon=" + ImageIcon +
                ", StudentName='" + StudentName + '\'' +
                ", StudentSubject='" + StudentSubject + '\'' +
                ", StudentsGrade='" + StudentsGrade + '\'' +
                '}';
    }
}
