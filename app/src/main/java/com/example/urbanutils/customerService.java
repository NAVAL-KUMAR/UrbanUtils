package com.example.urbanutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class customerService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_service);
        Bundle b=getIntent().getExtras();

        //Object of provider after clicking on list items in service list

        final Provider provider=(Provider)b.getSerializable("providerapproval");


    }


}
