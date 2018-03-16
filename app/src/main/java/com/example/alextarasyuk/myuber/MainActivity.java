package com.example.alextarasyuk.myuber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mDriverButton, mCustomerButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDriverButton=(Button) findViewById(R.id.driver);
        mCustomerButton=(Button)findViewById(R.id.customer);

        mDriverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this, DriverLogingActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mCustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, CustomerLoginActivity.class);
                startActivity(intent);
                finish();
                return;

            }
        });


    }
}
