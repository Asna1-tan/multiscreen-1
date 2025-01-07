package com.example.multiscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class Submit extends AppCompatActivity {

    private TextView display;
    private String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);


            display = findViewById(R.id.mName);

        Intent i = getIntent();
        name = i.getStringExtra("name");
        display.setText("hello !!!   "+name+"\n\n"+" It's great to see you.");
    }
}