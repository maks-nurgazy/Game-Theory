package com.luv2code.gametheory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Title>companies = new ArrayList<>();
        ArrayList<Topic> intoductionTopic = new ArrayList<>();
        intoductionTopic.add(new Topic("Course Content","Course vieo","Course Link"));

        Title intoduction = new Title("Introduction", intoductionTopic);
        companies.add(intoduction);

        ArrayList<Topic> lessonTopic = new ArrayList<>();
        lessonTopic.add(new Topic("Second Content","Second video","Second link"));

        Title microsoft = new Title("Second Title", lessonTopic);
        companies.add(microsoft);

        TopicAdapter adapter = new TopicAdapter(companies);
        recyclerView.setAdapter(adapter);

    }
}
