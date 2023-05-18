package com.example.npc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2,t3;
    Button b;
    String name,city,ph_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (EditText) findViewById(R.id.editText);
        t2= (EditText) findViewById(R.id.editText2);
        t3=(EditText)findViewById(R.id.editText3);
        b= (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name=t1.getText().toString();
                ph_no=t2.getText().toString();
                city=t3.getText().toString();

                Intent i = new Intent(MainActivity.this,MainActivity2.class);

                i.putExtra("name_key", name);
                i.putExtra("ph_key",ph_no);
                i.putExtra("city_key",city);

                startActivity(i);

            }
        });
    }
}



