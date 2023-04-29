package com.example.meditt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.gesture.GestureLibraries;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import java.io.File;

public class Record extends AppCompatActivity {

    private Button BtnView, BtnShare;
    private LinearLayout BtnLayout;

    Context context;

    File myFile;

    File pdfFolder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        builder.detectFileUriExposure();


        TextView medicineInfoTextView = findViewById(R.id.tv_text);

        // Set the text for the first medicine
        String medicineName1 = "Ibuprofen";
        int dosage1 = 400;
        String frequency1 = "6 Hours per pill";

        String medicineInfo1 = "Medicine Name: " + medicineName1 + "\n" +
                "Dosage: " + dosage1 + "mg\n" +
                "Frequency: " + frequency1;

        // Set the text for the second medicine
        String medicineName2 = "Penicillin";
        int dosage2 = 300;
        String frequency2 = "8 Hours per pill";

        String medicineInfo2 = "Medicine Name: " + medicineName2 + "\n" +
                "Dosage: " + dosage2 + "mg\n" +
                "Frequency: " + frequency2;

// Set the text of the TextView to display the medicine information
        medicineInfoTextView.setText(medicineInfo1 + "\n\n" + medicineInfo2);

        BtnView = findViewById(R.id.btn_share);
        BtnLayout = findViewById(R.id.btn_layout);


        BtnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharepdf();
            }
        });
    }

    private void sharepdf() {
        // add the link of pdf
        String value="https://anonsharing.com/file/591f79a22deef82b/Medicine_Record.pdf";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

        // start activity
        startActivity(intent);
    }

}
