package com.example.myproject001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    EditText edtNama, edtNik, edtEmail, inputTanggalLahir;
    Button btnRegister;
    TextView tvOutputDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

         edtNama = findViewById(R.id.edtNama);
        edtNik = findViewById(R.id.edtNik);
        edtEmail = findViewById(R.id.edtEmail);
        inputTanggalLahir = findViewById(R.id.inputTanggalLahir);

        btnRegister = findViewById(R.id.btnRegister);
        tvOutputDaftar = findViewById(R.id.tvOutputDaftar);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get data
                String nama = edtNama.getText().toString();
                String nik = edtNik.getText().toString();
                String email = edtEmail.getText().toString();
                String tglLahir = inputTanggalLahir.getText().toString();

                // menampilkan ke TextView Output
                tvOutputDaftar.setText(
                        "=== DATA REGISTER ===\n\n" +
                                "Nama          : " + nama + "\n" +
                                "NIK           : " + nik + "\n" +
                                "Email         : " + email + "\n" +
                                "Tanggal Lahir : " + tglLahir
                );
            }
        });

    }
}