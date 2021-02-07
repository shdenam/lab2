package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText hedit;
    Button hbutton;
    TextView htext ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        htext = (TextView) findViewById(R.id.htext);
        hedit=(EditText)findViewById(R.id.hedit);
        hbutton=(Button)findViewById(R.id.hbutton);

       hbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                String st = hedit.getText().toString();
                htext.setText("Hello " + st );

            }
        });


    }
}