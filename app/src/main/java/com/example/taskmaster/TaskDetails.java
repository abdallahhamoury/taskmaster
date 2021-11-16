package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TaskDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);
//        Intent intent=getIntent();
//        String taskTitle=intent.getExtras().getString("taskTitle");
//        TextView taskTitleView =findViewById(R.id.taskTitleId);
//        taskTitleView.setText(taskTitle);
        Intent intent=getIntent();
        String taskTitle=intent.getExtras().getString("taskNameClickListener");
        String taskBody=intent.getExtras().getString("taskBodyClickListener");
        String taskState=intent.getExtras().getString("taskStateClickListener");
        TextView taskTitleView =findViewById(R.id.taskTitleId);
        taskTitleView.setText("taskTitle:  "+taskTitle+" taskBody:  "+taskBody+"   taskState:  "+taskState);
    }
}