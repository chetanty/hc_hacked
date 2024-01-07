package com.example.hc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class PDF extends AppCompatActivity {
    PDFView pdfview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        pdfview = findViewById(R.id.pdfView);
        pdfview.fromAsset("2023_Free_Community_Meals_November.pdf").load();
    }
}