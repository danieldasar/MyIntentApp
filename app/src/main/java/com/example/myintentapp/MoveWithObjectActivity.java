package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObjectActivity extends AppCompatActivity {

    public static final String EXTRA_PERSON = "extra_person";
    TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        tvObject = findViewById(R.id.btn_move_activity_object);

        Person person = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name "+ person.getName()+",\n Email "+ person.getEmail() +",\n Age "+ person.getAge() +",\n City "+ person.getCity();
        tvObject.setText(text);
    }
}
