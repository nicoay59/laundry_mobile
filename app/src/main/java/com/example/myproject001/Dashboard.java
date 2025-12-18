package com.example.myproject001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.myproject001.fragment.FragmentKedua;
import com.example.myproject001.fragment.FragmentPertama;


public class Dashboard extends AppCompatActivity {

    FrameLayout frldashboard;
    Button btnFrg1, btnFrg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        frldashboard = findViewById(R.id.frl_dashboard);
        btnFrg1 = findViewById(R.id.btn_frg1);
        btnFrg2 = findViewById(R.id.btn_frg2);

        getSupportFragmentManager().beginTransaction().replace(R.id.frl_dashboard, new FragmentPertama()).commit();

        btnFrg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frl_dashboard, new FragmentPertama()).commit();
            }
        });

        btnFrg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frl_dashboard, new FragmentKedua()).commit();
            }
        });
    }
}