package com.example.android.udacity_project5;

/**
 * Created by NUSNAFIF on 10/7/2016.
 */

public class ReportCard {

    // Icons of Students
    private int mImageIcon;
    // Students Name
    private String mStudentName;
    // Students Subject
    private String mStudentSubject;
    // Students grade
    private String mStudentsGrade;

    public ReportCard(int imageIcon, String studentName, String studentSubject, String studentGrade) {
        mImageIcon = imageIcon;
        mStudentName = studentName;
        mStudentSubject = studentSubject;
        mStudentsGrade = studentGrade;
    }

    // Get Resource image
    public int getmImageIcon() {
        return mImageIcon;
    }

    // Get Student Name
    public String getmStudentName() {
        return mStudentName;
    }

    //Get Student Report Card
    public String getmStudentSubject() {
        return mStudentSubject;
    }

    //Get Student Grade
    public String getmStudentsGrade() {
        return mStudentsGrade;
    }
}
