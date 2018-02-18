package com.example.admin.callingapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        final EditText number = (EditText) findViewById(R.id.phoneNo);
        Button call = (Button) findViewById(R.id.dialBtn);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getnumber = number.getText().toString();
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel: " +getnumber));
                startActivity(callintent);
            }



        });

    }





}
