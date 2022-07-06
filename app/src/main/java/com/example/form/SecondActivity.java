package com.example.form;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
//        Toast.
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);

        Intent intent = getIntent();
        String firstName = intent.getExtras().getString("firstName");
        String lastName = intent.getExtras().getString("lastName");
        String age = intent.getExtras().getString("age");
        String dob = intent.getExtras().getString("dob");
        String sex = intent.getExtras().getString("sex");

        t1.setText(firstName);
        t2.setText(lastName);
        t3.setText(age);
        t4.setText(sex);
        t5.setText(dob);
    }
}
