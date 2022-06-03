package com.Jaydedaniya.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;

import java.util.Objects;
import java.util.regex.Pattern;

public class TextForm extends AppCompatActivity {

    EditText userName, passWord, userEmail, userBirthDate, userBirthTime, userNumber, userOtp;
    TextView userNameValidation, passWordValidation, userEmailValidation, userStateValidation, userCityValidation, userNumberValidation, userOtpValidation;
    AutoCompleteTextView userState;
    MultiAutoCompleteTextView userCity;
    String[] states = {
            "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir",
            "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab",
            "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal"};
    String[] cities = {
            "Bangalore", "Chennai", "Delhi", "Hyderabad", "Kolkata", "Mumbai", "Pune", "Ahmedabad", "Aurangabad", "Bangalore", "Belgaum", "Bhubaneswar",
            "Chandigarh", "Cochin", "Coimbatore", "Cuttack", "Dehradun", "Dhanbad", "Gandhinagar", "Gurgaon", "Guwahati", "Hubli", "Indore", "Jabalpur",
            "Jaipur", "Jalandhar", "Jammu", "Jamshedpur", "Jhansi", "Kakinada", "Koichi", "Kolkata", "Lucknow", "Ludhiana", "Madurai", "Mangalore", "Meerut",
            "Nagpur", "Nashik", "Noida", "Patna", "Pimpri-Chinchwad", "Pune", "Raipur", "Rajkot", "Ranchi", "Surat", "Thiruvananthapuram", "Thrissur",
            "Tiruchirappalli", "Tirunelveli", "Tiruppur", "Ujjain", "Vadodara", "Vijayawada", "Visakhapatnam", "Warangal"};

    MaterialDatePicker materialDatePicker;
    MaterialTimePicker materialTimePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_form);

//        This code use to hide ActionBar in app
        Objects.requireNonNull(getSupportActionBar()).hide();

//        This code use to user Name checked and decide to validation
        userName = findViewById(R.id.userName);
        userNameValidation = findViewById(R.id.userNameValidation);

        TextWatcher userNameTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String name = userName.getText().toString();

                if (name.isEmpty()) {
                    userNameValidation.setText(R.string.UserName_required);
                    userNameValidation.setTextColor(getResources().getColor(R.color.error));
                } else if (name.length() < 6) {
                    userNameValidation.setText(R.string.UserName_unValid);
                    userNameValidation.setTextColor(getResources().getColor(R.color.error));
                } else {
                    userNameValidation.setText(R.string.UserName_valid);
                    userNameValidation.setTextColor(getResources().getColor(R.color.validation_Done));
                }
            }
        };
        userName.addTextChangedListener(userNameTextWatcher);

//        This code use to user passWord checked and decide to validation
        passWord = findViewById(R.id.passWord);
        passWordValidation = findViewById(R.id.passWordValidation);

        TextWatcher passWordTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String pass = passWord.getText().toString();
                if (pass.isEmpty()) {
                    passWordValidation.setText(R.string.password_required);
                    passWordValidation.setTextColor(getResources().getColor(R.color.error));
                } else {
                    if (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$", pass)) {
                        passWordValidation.setText(R.string.password_valid);
                        passWordValidation.setTextColor(getResources().getColor(R.color.validation_Done));
                    } else {
                        passWordValidation.setText(R.string.password_unValid);
                        passWordValidation.setTextColor(getResources().getColor(R.color.error));
                    }
                }
            }
        };
        passWord.addTextChangedListener(passWordTextWatcher);

//        This code use to user email checked and decide to validation
        userEmail = findViewById(R.id.email);
        userEmailValidation = findViewById(R.id.emailValidation);

        TextWatcher userEmailTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String mail = userEmail.getText().toString();
                if (mail.isEmpty()) {
                    userEmailValidation.setText(R.string.email_required);
                    userEmailValidation.setTextColor(getResources().getColor(R.color.error));
                } else {
                    if ((Patterns.EMAIL_ADDRESS.matcher(mail).matches())) {
                        userEmailValidation.setText(R.string.email_valid);
                        userEmailValidation.setTextColor(getResources().getColor(R.color.validation_Done));
                    } else {
                        userEmailValidation.setText(R.string.email_unValid);
                        userEmailValidation.setTextColor(getResources().getColor(R.color.error));
                    }
                }
            }
        };
        userEmail.addTextChangedListener(userEmailTextWatcher);

//        This code use to user Birthdate checked or decide to validation and date select to material date picker
        userBirthDate = findViewById(R.id.birthDate);

        userBirthDate.setShowSoftInputOnFocus(false);
        userBirthDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materialDatePicker =
                        MaterialDatePicker.Builder.datePicker()
                                .setTitleText("Select date")
                                .build();

                materialDatePicker.show(getSupportFragmentManager(), "DATE_PICKER");
                materialDatePicker.addOnPositiveButtonClickListener(dialog -> {
                    userBirthDate.setText(materialDatePicker.getHeaderText());
                });
            }
        });

//        This code use to user BirthTime checked or decide to validation and Time select to material Time picker

        userBirthTime = findViewById(R.id.birthTime);

        userBirthTime.setShowSoftInputOnFocus(false);
        userBirthTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materialTimePicker =
                        new MaterialTimePicker.Builder()
                                .setTitleText("")
                                .setTimeFormat(TimeFormat.CLOCK_12H)
                                .setHour(12)
                                .setMinute(5)
                                .build();
                materialTimePicker.show(getSupportFragmentManager(), "TIME_PICKER");
                materialTimePicker.addOnPositiveButtonClickListener(dialog -> {
                    userBirthTime.setText("" + materialTimePicker.getHour() + ":" + materialTimePicker.getMinute());
                });
            }
        });


//        This code use to user Select State in dropDown list as create to Array Adapter in AutoCompleteTextView

        userState = findViewById(R.id.state);
        userStateValidation = findViewById(R.id.stateValidation);

        userState.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, states));
        userState.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        TextWatcher userStateTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String state = userState.getText().toString();
                if (state.isEmpty()) {
                    userStateValidation.setText(R.string.state_required);
                    userStateValidation.setTextColor(getResources().getColor(R.color.error));
                } else {
                    userStateValidation.setText(R.string.state_valid);
                    userStateValidation.setTextColor(getResources().getColor(R.color.validation_Done));
                }
            }
        };
        userState.addTextChangedListener(userStateTextWatcher);


//        This code use to user Select City in dropDown list as create to Array Adapter in MultiAutoCompleteTextView

        userCity = findViewById(R.id.city);
        userCityValidation = findViewById(R.id.cityValidation);

        userCity.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, cities));
        userCity.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        userCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        TextWatcher userCityTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String city = userCity.getText().toString();
                if (city.isEmpty()) {
                    userCityValidation.setText(R.string.state_required);
                    userCityValidation.setTextColor(getResources().getColor(R.color.error));
                } else {
                    userCityValidation.setText(R.string.state_valid);
                    userCityValidation.setTextColor(getResources().getColor(R.color.validation_Done));
                }
            }
        };
        userCity.addTextChangedListener(userCityTextWatcher);


//        This code use to user Phone Number checked and decide to validation

        userNumber = findViewById(R.id.number);
        userNumberValidation = findViewById(R.id.numberValidation);

        TextWatcher userNumberTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String number = userNumber.getText().toString();
                if (number.isEmpty()) {
                    userNumberValidation.setText(R.string.number_required);
                    userNumberValidation.setTextColor(getResources().getColor(R.color.error));
                } else {
                    if (number.length() == 10) {
                        userNumberValidation.setText(R.string.number_Valid);
                        userNumberValidation.setTextColor(getResources().getColor(R.color.validation_Done));
                    } else {
                        userNumberValidation.setText(R.string.number_unValid);
                        userNumberValidation.setTextColor(getResources().getColor(R.color.error));
                    }
                }
            }
        };
        userNumber.addTextChangedListener(userNumberTextWatcher);


        //        This code use to user Phone Number checked and decide to validation

        userOtp = findViewById(R.id.numberOTP);
        userOtpValidation = findViewById(R.id.OtpValidation);

        TextWatcher userNumberOtpTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String otp = userOtp.getText().toString();
                if (otp.isEmpty()) {
                    userOtpValidation.setText(R.string.otp_required);
                    userOtpValidation.setTextColor(getResources().getColor(R.color.error));
                } else {
                    if (otp.length() == 6) {
                        userOtpValidation.setText(R.string.otp_Valid);
                        userOtpValidation.setTextColor(getResources().getColor(R.color.validation_Done));
                    } else {
                        userOtpValidation.setText(R.string.otp_UnValid);
                        userOtpValidation.setTextColor(getResources().getColor(R.color.error));
                    }
                }
            }
        };
        userOtp.addTextChangedListener(userNumberOtpTextWatcher);

    }
}