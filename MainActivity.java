package com.example.tech_repair_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectDevice(View view)
    {
        if(view == findViewById(R.id.imageButton))
        {
            Intent moveToPhoneInfo = new Intent(this, DeviceInfo.class);
            startActivity(moveToPhoneInfo);
        }
        if(view == findViewById(R.id.imageButton2))
        {

        }
        if(view == findViewById(R.id.imageButton3))
        {

        }
    }
}
