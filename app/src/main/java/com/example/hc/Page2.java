package com.example.hc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Page2 extends AppCompatActivity {

    Button pdfBtn,adultsBtn,youthsBtn,btn911,btn211,btn811,btnHM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        pdfBtn = findViewById(R.id.foodbtn);
        adultsBtn = findViewById(R.id.adults_btn);
        youthsBtn = findViewById(R.id.youths_btn);
        btn211 = findViewById(R.id.btn211);
        btn811 = findViewById(R.id.btn811);
        btn911 = findViewById(R.id.btn911);
        btnHM = findViewById(R.id.btnHM);
        pdfOpen();
        adultsOpen();
        youthsOpen();
        call911();
        call811();
        call211();
        callHM();
    }

    private void pdfOpen() {
        pdfBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this, PDF.class);
                startActivity(intent);
            }
        });
    }
    private void adultsOpen() {
            adultsBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Page2.this, Adults.class);
                    startActivity(intent);
                }
            });
    }
    private void youthsOpen() {
        youthsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this, Youths.class);
                startActivity(intent);
            }
        });
    }
    private void call911() {
        btn911.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String number="911";

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" +number));
                startActivity(intent);

            }
        });
    }
    private void call811() {
        btn811.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String number="811";

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" +number));
                startActivity(intent);

            }
        });
    }
    private void call211() {
        btn211.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String number="211";

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" +number));
                startActivity(intent);

            }
        });
    }
    private void callHM() {
        btnHM.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String number="7804222018";

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" +number));
                startActivity(intent);

            }
        });
    }
}