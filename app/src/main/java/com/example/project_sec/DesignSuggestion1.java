package com.example.project_sec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DesignSuggestion1 extends AppCompatActivity {
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_suggestion1);
        b1=findViewById(R.id.button30);
        final EditText edit_name = findViewById(R.id.editTextTextPersonName2);
        final EditText edit_position = findViewById(R.id.editTextTextPersonName3);
        DAODesign dao =new DAODesign();
        Design emp_edit = (Design)getIntent().getSerializableExtra("EDIT");

        b1.setOnClickListener(v-> {

            Design emp = new Design(edit_name.getText().toString(), edit_position.getText().toString());
            dao.add(emp).addOnSuccessListener(suc ->
            {
                Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er ->
            {
                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
            });
            Intent intent = new Intent(DesignSuggestion1.this, DesignSuggestion2.class);
            startActivity(intent);
        });}


}
