package com.rg17.lettorooms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    private Button usersignup;
    private TextView already;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        usersignup=findViewById(R.id.signup);
        already=findViewById(R.id.create);

        usersignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignupActivity.this, LandlordTenant.class);
                startActivity(intent);
            }
        });

        already.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}
