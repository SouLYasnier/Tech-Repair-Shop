package com.example.techrepair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextScreenPhone(View view) {
        Intent moveToNextActivity = new Intent(this, CustomerInfo.class);
        moveToNextActivity.putExtra("dType", "SmartPhone");
        startActivity(moveToNextActivity);

    }

    public void nextScreenPC(View view) {
        Intent moveToNextActivity = new Intent(this, CustomerInfo.class);
        moveToNextActivity.putExtra("dType", "PC/Laptop");
        startActivity(moveToNextActivity);

    }

    public void nextScreenTablet(View view) {
        Intent moveToNextActivity = new Intent(this, CustomerInfo.class);
        moveToNextActivity.putExtra("dType", "Tablet");
        startActivity(moveToNextActivity);

    }
}
