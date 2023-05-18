package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
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
        EditText a=(EditText)findViewById(R.id.editTextNumber);
        EditText b=(EditText)findViewById(R.id.editTextNumber2);
        Button sum=(Button)findViewById(R.id.sum);
        Button sub=(Button)findViewById(R.id.sub);
        Button mul=(Button)findViewById(R.id.mul);
        Button div=(Button)findViewById(R.id.div);
        TextView txt=(TextView)findViewById(R.id.textView);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x=Float.parseFloat(a.getText().toString());
                float y= Float.parseFloat (b.getText().toString());
                float z=x+y;
                Intent intent = new Intent(MainActivity.this,result.class);
                intent.putExtra("res",z);
                startActivity(intent);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x= Float.parseFloat (a.getText().toString());
                float y= Float.parseFloat (b.getText().toString());
                float z=x-y;
                Intent intent = new Intent(MainActivity.this,result.class);
                intent.putExtra("res",z);
                startActivity(intent);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x= Float.parseFloat (a.getText().toString());
                float y= Float.parseFloat (b.getText().toString());
                float z=x*y;
                Intent intent = new Intent(MainActivity.this,result.class);
                intent.putExtra("res",z);
                startActivity(intent);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                float x= Float.parseFloat (a.getText().toString());
                float y= Float.parseFloat (b.getText().toString());
                float z=x/y;
                Intent intent = new Intent(MainActivity.this,result.class);
                intent.putExtra("res",z);
                startActivity(intent);
            }
        });
    }
}