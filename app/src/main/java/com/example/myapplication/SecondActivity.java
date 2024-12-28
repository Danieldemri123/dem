package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // אתחול של TextView ו-Button
        TextView textView = findViewById(R.id.textView);
        Button buttonClose = findViewById(R.id.buttonClose);

        // קבלת הטקסט שנשלח מאקטיביטי הראשונה
        String receivedText = getIntent().getStringExtra("userText");

        // הצגת הטקסט ב-TextView
        textView.setText(receivedText);

        // הגדרת כפתור לסגירת האקטיביטי
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // סגירת אקטיביטי הנוכחית
                finish();
            }
        });
    }
}
