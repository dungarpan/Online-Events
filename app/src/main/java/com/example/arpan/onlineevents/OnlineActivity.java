package com.example.arpan.onlineevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class OnlineActivity extends AppCompatActivity {

    public void todesc1(View view){
        Intent intent = new Intent(getApplicationContext(),desc1.class);
        startActivity(intent);
    }
    public void todesc2(View view){
        Intent intent = new Intent(getApplicationContext(),desc2.class);
        startActivity(intent);
    }
    public void todesc3(View view){
        Intent intent = new Intent(getApplicationContext(),desc3.class);
        startActivity(intent);
    }
    public void todesc4(View view){
        Intent intent = new Intent(getApplicationContext(),desc4.class);
        startActivity(intent);
    }
    public void todesc5(View view){
        Intent intent = new Intent(getApplicationContext(),desc5.class);
        startActivity(intent);
    }
    public void todesc6(View view){
        Intent intent = new Intent(getApplicationContext(),desc6.class);
        startActivity(intent);
    }
    public void todesc7(View view){
        Intent intent = new Intent(getApplicationContext(),desc7.class);
        startActivity(intent);
    }
    public void todesc8(View view){
        Intent intent = new Intent(getApplicationContext(),desc8.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
    }
}
