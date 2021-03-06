package com.Jaydedaniya.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    //    This define to all views at create a activity_home.xml
    TextView textForm, buttonForm;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        This code use to hide ActionBar in app
        Objects.requireNonNull(getSupportActionBar()).hide();

//        This code to find the view in activity_home.xml
        textForm = findViewById(R.id.textForm);
        buttonForm = findViewById(R.id.buttonForm);

//        This code to set on click event at textForm
        textForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, TextForm.class);
                startActivity(intent);
            }
        });

//        This code to set on click event at textForm
        buttonForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(HomeActivity.this,ButtonForm.class);
                startActivity(intent);
            }
        });

    }
}