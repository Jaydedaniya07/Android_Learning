package com.Jaydedaniya.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class ButtonForm extends AppCompatActivity {

    ImageButton profilePicture;
    RadioGroup genderRadioGroup;
    RadioButton maleRadioButton, femaleRadioButton, othersRadioButton;
    CheckBox checkBox_surat, checkBox_ahmedabad, checkBox_vadodara, checkBox_rajkot, checkBox_delhi, checkBox_bangalore, checkBox_patna, checkBox_kolkata;
    ChipGroup chipGroup;
    Chip surat, ahmedabad, vadodara, rajkot, delhi, bangalore, patna, kolkata;


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
                if (checkedId == R.id.maleRadioButton) {
                    maleRadioButton.setChecked(true);
                    Toast.makeText(getApplicationContext(), "Male", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.femaleRadioButton) {
                    femaleRadioButton.setChecked(true);
                    Toast.makeText(getApplicationContext(), "Female", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.othersRadioButton) {
                    othersRadioButton.setChecked(true);
                    Toast.makeText(getApplicationContext(), "Others", Toast.LENGTH_SHORT).show();
                }
            }
        });

//        This code use to Check any checkBox to visible chip to same as checkBox
        checkBox_surat = findViewById(R.id.checkBox_Surat);
        checkBox_vadodara = findViewById(R.id.checkBox_Vadodara);
        checkBox_rajkot = findViewById(R.id.checkBox_Rajkot);
        checkBox_kolkata = findViewById(R.id.checkBox_Kolkata);
        checkBox_delhi = findViewById(R.id.checkBox_Delhi);
        checkBox_patna = findViewById(R.id.checkBox_Patna);
        checkBox_ahmedabad = findViewById(R.id.checkBox_Ahmedabad);
        checkBox_bangalore = findViewById(R.id.checkBox_Bangalore);

        chipGroup = findViewById(R.id.ChipGroup);
        surat = findViewById(R.id.surat);
        ahmedabad = findViewById(R.id.ahmedabad);
        vadodara = findViewById(R.id.vadodara);
        rajkot = findViewById(R.id.rajkot);
        delhi = findViewById(R.id.dehli);
        bangalore = findViewById(R.id.bangalore);
        patna = findViewById(R.id.patna);
        kolkata = findViewById(R.id.kolkata);


        checkBox_surat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox_surat.isChecked()) {
                    surat.setVisibility(View.VISIBLE);
                } else {
                    surat.setVisibility(View.GONE);
                }
            }
        });

        checkBox_vadodara.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox_vadodara.isChecked()) {
                    vadodara.setVisibility(View.VISIBLE);
                } else {
                    vadodara.setVisibility(View.GONE);
                }
            }
        });

        checkBox_rajkot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox_rajkot.isChecked()) {
                    rajkot.setVisibility(View.VISIBLE);
                } else {
                    rajkot.setVisibility(View.GONE);
                }
            }
        });

        checkBox_kolkata.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox_kolkata.isChecked()) {
                    kolkata.setVisibility(View.VISIBLE);
                } else {
                    kolkata.setVisibility(View.GONE);
                }
            }
        });

        checkBox_delhi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox_delhi.isChecked()) {
                    delhi.setVisibility(View.VISIBLE);
                } else {
                    delhi.setVisibility(View.GONE);
                }
            }
        });

        checkBox_patna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox_patna.isChecked()) {
                    patna.setVisibility(View.VISIBLE);
                } else {
                    patna.setVisibility(View.GONE);
                }
            }
        });

        checkBox_ahmedabad.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox_ahmedabad.isChecked()) {
                    ahmedabad.setVisibility(View.VISIBLE);
                } else {
                    ahmedabad.setVisibility(View.GONE);
                }
            }
        });

        checkBox_bangalore.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox_bangalore.isChecked()) {
                    bangalore.setVisibility(View.VISIBLE);
                } else {
                    bangalore.setVisibility(View.GONE);
                }
            }
        });


    }
}