package com.example.project_sec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AutoLogo2Activity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b8;
    private Button b7;
    private Button b9;



    public static String bb1;
    public static String bb2;
    public static String bb3;
    public static String bb4;
    public static String bb5;
    public static String bb6;
    public static String bb8;
    public static String bb7;
    public static String bb9;
    public static String gg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_logo2);
        b1=findViewById(R.id.button50);

        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button12);
        b6=findViewById(R.id.button13);
        b7=findViewById(R.id.button14);
        b8=findViewById(R.id.button15);
        b9=findViewById(R.id.button16);
        DAOLogo dao =new DAOLogo();
        Employee emp_edit = (Employee)getIntent().getSerializableExtra("EDIT");
        b1.setOnClickListener(v-> {
            Logo emp = new Logo();

            Logo emp1 = new Logo(AutoLogoActivity.s1,AutoLogoActivity.s2,AutoLogo1Activity.s3,gg);
            dao.add(emp).addOnSuccessListener(suc ->
            {
                Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er ->
            {
                Toast.makeText(this, "Data Wich" , Toast.LENGTH_SHORT).show();
            });
            Intent intent = new Intent(AutoLogo2Activity.this, AutoLogo3Activity.class);
            startActivity(intent);
        });




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gg=b2.getText().toString();
                bb1=b2.getText().toString();
                Logo.button1=b2.getText().toString();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gg=b2.getText().toString();
                bb2=b3.getText().toString();
                Logo.button1=b3.getText().toString();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gg=b2.getText().toString();
                bb3=b4.getText().toString();
                Logo.button1=b4.getText().toString();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gg=b2.getText().toString();
                bb4=b5.getText().toString();
                Logo.button1=b5.getText().toString();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gg=b2.getText().toString();
                bb5=b6.getText().toString();
                Logo.button1=b6.getText().toString();

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gg=b2.getText().toString();
                bb6=b7.getText().toString();
                Logo.button1=b7.getText().toString();

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gg=b2.getText().toString();
                bb7=b8.getText().toString();
                Logo.button1=b8.getText().toString();

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gg=b2.getText().toString();
                bb8=b9.getText().toString();
                Logo.button1=b9.getText().toString();

            }
        });
    }
}