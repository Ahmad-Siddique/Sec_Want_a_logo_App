package com.example.project_sec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private Button b1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button5);
        final EditText edit_name = findViewById(R.id.editTextTextPersonName);
        final EditText edit_position = findViewById(R.id.editTextTextPassword);
        DAOEmployee dao =new DAOEmployee();
        Employee emp_edit = (Employee)getIntent().getSerializableExtra("EDIT");


        b1.setOnClickListener(v-> {

            Employee emp = new Employee(edit_name.getText().toString(), edit_position.getText().toString());
            dao.add(emp).addOnSuccessListener(suc ->
            {
                Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er ->
            {
                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
            });
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        });}
}