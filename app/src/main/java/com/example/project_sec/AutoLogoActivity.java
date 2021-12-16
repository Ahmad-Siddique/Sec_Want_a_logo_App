package com.example.project_sec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AutoLogoActivity extends AppCompatActivity {
    private Button b5;
    public static String s1;
    public static String s2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_logo);
        b5=findViewById(R.id.button30);
        final EditText edit_name = findViewById(R.id.editTextTextPersonName2);
        final EditText edit_position = findViewById(R.id.editTextTextPersonName3);
        s1=edit_name.getText().toString();
        s2=edit_position.getText().toString();
        DAOLogo dao =new DAOLogo();



        b5.setOnClickListener(v-> {

            Logo.name1=edit_name.getText().toString();
            Logo.tagline1=edit_position.getText().toString();
            Intent intent = new Intent(AutoLogoActivity.this, AutoLogo1Activity.class);
            startActivity(intent);
        });
    }
}


