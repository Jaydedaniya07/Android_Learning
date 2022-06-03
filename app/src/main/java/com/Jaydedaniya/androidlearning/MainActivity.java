package com.Jaydedaniya.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        This code use to hide ActionBar in app
        Objects.requireNonNull(getSupportActionBar()).hide();

//        This code use to how much time hold the Splash Screen and after Goto Home Activity using Intent
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 50; i++) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                onEnterAnimationComplete();
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        }).start();
    }
}