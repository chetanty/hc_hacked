package com.example.hc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

public class Page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        PDFView pdfView = findViewById(R.id.pdfView); // Make sure you have a PDFView in your layout
        pdfView.fromAsset("d.pdf").load();
    }
}
