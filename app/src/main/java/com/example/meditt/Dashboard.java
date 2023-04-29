package com.example.meditt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        TextView textViewF1 = findViewById(R.id.f1);
        textViewF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, MedicationList.class);
                startActivity(intent);
            }
        });

        TextView textViewF2 = findViewById(R.id.f2);
        textViewF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Reminder.class);
                startActivity(intent);
            }
        });

        TextView textViewF3 = findViewById(R.id.f3);
        textViewF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Record.class);
                startActivity(intent);
            }
        });

        TextView textViewF4 = findViewById(R.id.f4);
        textViewF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Interaction.class);
                startActivity(intent);
            }
        });
    }
}
