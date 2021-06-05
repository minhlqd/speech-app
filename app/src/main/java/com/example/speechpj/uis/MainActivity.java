package com.example.speechpj.uis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.speechpj.R;

public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2,btn_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1 = findViewById(R.id.audio);
        btn_2 = findViewById(R.id.record);
        btn_3 = findViewById(R.id.tts);

        btn_1.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, AudioActivity.class)));

        btn_2.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, RecordActivity.class)));

        btn_3.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, TextActivity.class)));
    }
}