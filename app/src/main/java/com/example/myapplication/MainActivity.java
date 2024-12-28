package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // אתחול של EditText ו-Button
        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);

        // הגדרת לחיצה על הכפתור
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // קבלת הטקסט שהוזן
                String userInput = editText.getText().toString();

                // יצירת Intent עבור SecondActivity
                Intent intent = new Intent(MainActivity.this, com.example.myapplication.SecondActivity.class);

                // העברת הטקסט לאקטיביטי השנייה
                intent.putExtra("userText", userInput);

                // הפעלת SecondActivity
                startActivity(intent);
            }
        });
    }
}
