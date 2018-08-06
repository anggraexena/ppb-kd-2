package com.example.anggraexena.onewfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText panjang, lebar, tinggi;
    private TextView hasil;
    private Button hitung;
    private static final String STATE_HASIL = "state hasil";

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(STATE_HASIL, hasil.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panjang = (EditText) findViewById(R.id.length);
        lebar = (EditText) findViewById(R.id.width);
        tinggi = (EditText) findViewById(R.id.height);
        hasil = (TextView) findViewById(R.id.results);
        hitung = (Button) findViewById(R.id.count);


        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                String lenght = panjang.getText().toString().trim();
                String width = lebar.getText().toString().trim();
                String height = tinggi.getText().toString().trim();

                double l = Double.parseDouble(lenght);
                double w = Double.parseDouble(width);
                double h = Double.parseDouble(height);
                double vol = l * w * h;
                hasil.setText(String.valueOf(vol));
            }
        });
    }
    public void Move(View view){
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }
    }

