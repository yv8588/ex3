package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rnd = new Random();
    Button btn1;
    Button btn2;
    TextView tv;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn1=(Button) findViewById(R.id.btn1);
         btn2=(Button) findViewById(R.id.btn2);
         tv=(TextView)findViewById(R.id.tv);

    }

    public void click(View view) {
        tv.setText("number not found");

    }

    public void clear(View view) {
        x=rnd.nextInt(6)+1;
        tv.setText("number="+x);
    }
}
