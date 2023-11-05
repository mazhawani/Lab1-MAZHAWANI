package com.example.lab1_mazhawani;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;
    EditText etName;
    ImageView imageView;

    int counter=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.textView);
        submitButton = (Button) findViewById(R.id.button);
        etName= (EditText)findViewById(R.id.editTextText);
        imageView=findViewById(R.id.imageView);
    }

    public void displayText(View view){
        String text= etName.getText().toString();
        tvMessage.setText("Welcome " + text);
        Toast toast = Toast.makeText(this, "Welcome ", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void resetText(View view) {
        etName.getText().clear();
        tvMessage.setText("Welcome");
        Toast toast = Toast.makeText(this, "Name cleared", Toast.LENGTH_SHORT);
        toast.show();
    }
}