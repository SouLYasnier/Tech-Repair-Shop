package com.example.techrepair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CustomerInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_info);
        TextView deviceType = findViewById(R.id.deviceType);
        Intent intent = getIntent();
        deviceType.setText(intent.getStringExtra("dType"));

    }
}
