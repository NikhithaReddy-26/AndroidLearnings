package com.example.week10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;
import java.io.*;

public class MainActivity extends AppCompatActivity {
    private Button b;
    private EditText e1;
    private String file = "exfile";
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.bn);
        e1 = findViewById(R.id.et1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = e1.getText().toString();
                try{
                    FileOutputStream fout = openFileOutput(file,MODE_PRIVATE);
                    fout.write(data.getBytes());
                    fout.close();
                    Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
