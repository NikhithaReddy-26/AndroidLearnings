package com.example.eventlisteners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name=(EditText) findViewById(R.id.editTextTextPersonName);
        EditText city=(EditText) findViewById(R.id.editTextTextPersonName2);
        EditText phone=(EditText)findViewById(R.id.editTextPhone);
        TextView txt=(TextView)findViewById(R.id.textView);
        Button b=(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=name.getText().toString();
                String c=city.getText().toString();
                int p=Integer.parseInt(phone.getText().toString());
                txt.setText("name="+n+"\n"+"City"+c+"\n"+"phone no"+p);
            }
        });

    }
}