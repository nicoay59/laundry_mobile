package com.example.myproject001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/* import handler */
import android.os.Handler;
import android.content.Intent;


public class SplashActivityLauncher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_launcher);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivityLauncher.this
                        ,MainLoginLayout.class));
                finish();
            }
        },1000); // 1 detik
    }

}


