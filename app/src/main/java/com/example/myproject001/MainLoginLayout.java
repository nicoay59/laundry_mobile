package com.example.myproject001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Button;

public class MainLoginLayout extends AppCompatActivity {

    TextView textIntent;
    Intent intent;
    Button loginDashboard;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login_layout);

        /* Ambil ID TextView lupaPassword */
        textIntent = findViewById(R.id.lupaPassword);

        /* Listener ketika TextView diklik */
        textIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Pindah ke LupaPassword */
                intent = new Intent(MainLoginLayout.this, LupaPassword.class);

                /* Kirim value (puExtra) */
                intent.putExtra("massage", "Ini adalah efek dari eksplisit intent");

                startActivity(intent);
            }
        });

        /* BUTTON LOGIN MASUK → PINDAH KE DASHBOARD */
        loginDashboard = findViewById(R.id.loginDashboard);

        loginDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDashboard = new Intent(MainLoginLayout.this, Dashboard.class);
                startActivity(intentDashboard);
            }
        });

        /* BUTTON DAFTAR → PINDAH KE REGISTER */
        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(MainLoginLayout.this, Register.class);
                startActivity(reg);
            }
        });

    }
}