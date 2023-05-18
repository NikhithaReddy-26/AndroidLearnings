package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView txt1;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 =(TextView)findViewById(R.id.textView);
        txt1.setTextColor(Color.RED);
        b1=(Button)findViewById(R.id.changesize);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setTextSize(20);
                txt1.setTextSize(50);
            }
        });
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setTextSize(20);
                txt1.setTextColor(Color.BLUE);
            }
        });
    }
}