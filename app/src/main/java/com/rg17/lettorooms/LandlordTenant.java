package com.rg17.lettorooms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandlordTenant extends AppCompatActivity {

    Button signland, signtenant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landlord_tenant);

        signland=findViewById(R.id.landlord);


        signland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LandlordTenant.this, Landlord.class);
                startActivity(intent);
            }
        });


    }
}
