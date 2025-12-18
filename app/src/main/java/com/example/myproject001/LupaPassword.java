package com.example.myproject001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;
import android.net.Uri;

public class LupaPassword extends AppCompatActivity {

    TextView textIntent;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        /* Get value intent yang dikirim dari main */
        String message = getIntent().getStringExtra("massage");

        /* Menampilkan value menggunakan Toast */
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        textIntent = findViewById(R.id.lupaPassword);
        textIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://itts.ac.id"));
                startActivity(intent);
            }
        });
    }
}