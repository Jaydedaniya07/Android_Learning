package com.Jaydedaniya.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ButtonForm extends AppCompatActivity {

    ImageButton profilePicture;
    RadioGroup genderRadioGroup;
    RadioButton maleRadioButton, femaleRadioButton, othersRadioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_form);
        
//        This code to hide ActionBar
        getSupportActionBar().hide();

        profilePicture = findViewById(R.id.profilePicture);

//        This code use to RadioGroup & RadioButton View
        genderRadioGroup = findViewById(R.id.genderRadioGroup);
        maleRadioButton = findViewById(R.id.maleRadioButton);
        femaleRadioButton = findViewById(R.id.femaleRadioButton);
        othersRadioButton = findViewById(R.id.othersRadioButton);

        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if(checkedId == R.id.maleRadioButton)
                {
                    maleRadioButton.setChecked(true);
                    Toast.makeText(getApplicationContext(), "Male", Toast.LENGTH_SHORT).show();
                }
                else if(checkedId == R.id.femaleRadioButton)
                {
                    femaleRadioButton.setChecked(true);
                    Toast.makeText(getApplicationContext(), "Female", Toast.LENGTH_SHORT).show();
                }
                else if(checkedId == R.id.othersRadioButton)
                {
                    othersRadioButton.setChecked(true);
                    Toast.makeText(getApplicationContext(), "Others", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}