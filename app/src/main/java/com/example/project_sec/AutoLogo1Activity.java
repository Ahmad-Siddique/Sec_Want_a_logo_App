package com.example.project_sec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AutoLogo1Activity extends AppCompatActivity {
    private Button b1;
    public static String s3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_logo1);
        b1=findViewById(R.id.button40);
        final EditText edit_name = findViewById(R.id.editTextTextPersonName3);
        s3=edit_name.getText().toString();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Logo.logo_for1=edit_name.getText().toString();

                Intent intent = new Intent(AutoLogo1Activity.this, AutoLogo2Activity.class);
                startActivity(intent);

            }
        });
    }
}