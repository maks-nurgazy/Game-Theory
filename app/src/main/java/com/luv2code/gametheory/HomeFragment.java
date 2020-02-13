package com.luv2code.gametheory;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private TextView course;
    private TextView books;
    private TextView notes;
    private TextView quiz;


    public HomeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        course = v.findViewById(R.id.course);
        quiz = v.findViewById(R.id.quiz);
        notes = v.findViewById(R.id.notes);
        books = v.findViewById(R.id.books);

        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CourseActivity.class);
                startActivity(intent);
            }
        });

        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BooksActivity.class);
                startActivity(intent);
            }
        });

        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NotesActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }


}
