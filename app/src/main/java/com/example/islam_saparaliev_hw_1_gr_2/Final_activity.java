package com.example.islam_saparaliev_hw_1_gr_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Final_activity extends AppCompatActivity {
    TextView HalloText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        HalloText = (TextView) findViewById(R.id.textFinal);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String fullName = firstName + " " + lastName;
        HalloText.setText("Вы успешно зарегались " + fullName + "!");
    }
}