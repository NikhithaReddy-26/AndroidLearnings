package com.example.myapplication;

import static com.example.myapplication.R.drawable.India2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            b1=(Button)findViewById(R.id.bn);
            b2=(Button)findViewById(R.id.bn1);
            i=(ImageView)findViewById(R.id.iv);
            b1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          New Thread(new Runnable() {
                                              public void run () {
                                                  i.post(new Runnable() {
                                                      @Override
                                                      public void run() {
                                                          i.setImageResource(R.drawable.india1);
                                                      }
                                                  });
                                              }
                                          }
                                      }
                                  }).Start();
     b2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
        New Thread(New Runnable(){
            public void run(){
                i.post(new Runnable() {
                    @Override
                    public void run() {
                        i.setImageResource(R.drawable.india2);
                    }
                });
            }
        });
    }
    }).Start();
    }
}