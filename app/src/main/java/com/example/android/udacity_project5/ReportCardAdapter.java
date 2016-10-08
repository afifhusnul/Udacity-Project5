package com.example.android.udacity_project5;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NUSNAFIF on 10/7/2016.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {


    private static final String LOG_TAG = ReportCardAdapter.class.getSimpleName();

    public ReportCardAdapter(Activity context, ArrayList<ReportCard> reportCards) {
        super(context, 0, reportCards);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        ReportCard currentReportCard = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // set the image to iconView
        iconView.setImageResource(currentReportCard.getImageIcon());

        // Find the TextView in the list_item.xml layout with the ID student_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.student_name);
        // set this text on the subject TextView
        nameTextView.setText(currentReportCard.getStudentName());

        // Find the TextView in the list_item.xml layout with the ID student_subject
        TextView subjectTextView = (TextView) listItemView.findViewById(R.id.student_subject);
        // set this text on the subject TextView
        subjectTextView.setText(currentReportCard.getStudentSubject());

        // Find the TextView in the list_item.xml layout with the ID student_grade
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.student_grade);
        // set this text on the grade TextView
        numberTextView.setText(currentReportCard.getStudentsGrade());

        // Return the whole list item layout (containing 3 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
