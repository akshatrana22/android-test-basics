package com.example.hpuser.second_project;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    EditText e3;
    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= findViewById(R.id.name_1);
        e2= findViewById(R.id.fees_1);
        e3= findViewById(R.id.course_1);
        b1= findViewById(R.id.display_1);
        b2= findViewById(R.id.submit_2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = String.valueOf(e1.getText());
                int f = Integer.parseInt(e2.getText().toString());
                int c = Integer.parseInt(e3.getText().toString());

                Toast.makeText(getApplicationContext(), "name is" + e1 + "course is" + c + "fees is" + f, Toast.LENGTH_LONG).show();


            }
        });
    }
}




