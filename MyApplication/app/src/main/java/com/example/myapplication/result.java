package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class result extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txt=(TextView)findViewById(R.id.textView);
        float sum=getIntent().getExtras().getFloat("res");
        txt.setText("result= "+sum);
    }
}