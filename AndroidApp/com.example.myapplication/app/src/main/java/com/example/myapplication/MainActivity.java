package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button click;
    Button reset;
    TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button)findViewById(R.id.click);
        reset = (Button)findViewById(R.id.reset);
        counter = (TextView) findViewById(R.id.counter);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String counterval = counter.getText().toString();
                int val = Integer.parseInt(counterval);
                val++;

                counter.setText( String.valueOf(val) );
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setText( String.valueOf(0) );
            }
        });
    }
}
