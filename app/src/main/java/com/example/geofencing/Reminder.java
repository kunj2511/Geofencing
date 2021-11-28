package com.example.geofencing;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Reminder extends AppCompatActivity {
    EditText etitle,edescription;
    CheckBox center,cexit;
    Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        ActionBar actionBar=getSupportActionBar();
        getSupportActionBar().setTitle("Create Reminder");

        etitle=findViewById(R.id.title);
        edescription=findViewById(R.id.description);
        center=findViewById(R.id.enter);
        cexit=findViewById(R.id.exit);

        create=findViewById(R.id.submit);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(center.isChecked()){

                }
            }
        });


    }
}