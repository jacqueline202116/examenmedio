package com.example.calse0309;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button botoncito ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        botoncito= findViewById(R.id.button2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}