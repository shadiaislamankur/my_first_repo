package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = findViewById(R.id.textView2);

        myTextView.setText("Hi from Java");
        EditText myEditText = findViewById(R.id.editText);
        String inputText = myEditText.getText().toString();
        ImageView myImageView = findViewById(R.id.myIMG);
        myImageView.setImageResource(R.drawable.meme);

        Button myBTN = findViewById(R.id.myBtn);
        myBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This code will be executed when the button is clicked
              // Toast.makeText(MainActivity.this,"You Click the Button",Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "You Click the Button", Toast.LENGTH_SHORT).show();

            }
        });


    }
}