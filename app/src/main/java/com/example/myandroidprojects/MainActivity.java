package com.example.myandroidprojects;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import sun.security.ec.point.ProjectivePoint;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started App", "My very first android project, 'The Hello World' app.", R.drawable.getting_started),
                new Project("Quote App", "I learned about the fundamentals of xml and layouts in Android.", R.drawable.quote),
                new Project("BMI Calculator", "A classic. Calculates a person's BMI. I learnt about maths, variables and methods in Java.", R.drawable.tape),
                new Project("Inches To Meters Converter", "Converts inches to meters using a simple formula.", R.drawable.bmi_calculator),
                new Project("Gola Sizzlers (Restaurant App)", "A simple app for a restaurant. Shows the user about what is available in the eatery. I learnt about Intents, ListView and CardView.", R.drawable.hungry_developer),
                new Project("Bucket List App", "An app that lists all off the things I want to do and the places I want to visit.", R.drawable.bucket_list),
                new Project("Self Promo App", "An app that helps you to create a self-promo message. I learnt about kotlin, checkboxes and styled edit texts.", R.drawable.self_promo),
                new Project("Registration App", "An app that can register you for a service. I practiced implicit intents and creating stylish forms.", R.drawable.registration),
                new Project("Record Keeper", "It keeps track of your running and cycling records. I learnt about fragments and the bottom navigation bar widget.", R.drawable.record_keeper),
                new Project("Calculator", "It is a simple calculator app made with Kotlin.", R.drawable.calculator),
                new Project("Get It Done", "A to do app.", R.drawable.getItDone)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);
    }
}