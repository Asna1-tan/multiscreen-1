package com.example.multiscreen;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
 private TextInputEditText user;
 private TextInputEditText pass;
 private Button sub;
 String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
             user=findViewById(R.id.textinput1);
             pass=findViewById(R.id.textinput2);
             sub=findViewById(R.id.button);


            Button sub=findViewById(R.id.button);
            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        sendData();

                }
            });
    }
    public void sendData(){
       name = user.getText().toString().trim();

       Intent i = new Intent(MainActivity.this,Submit.class);

       i.putExtra("name", name);

       startActivity(i);
    }
}