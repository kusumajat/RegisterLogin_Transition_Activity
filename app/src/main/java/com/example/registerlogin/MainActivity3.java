package com.example.registerlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnLogin;
    TextView Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        Register = findViewById(R.id.tvRegisterLink);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ambil input dari EditText
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                // Cek jika username dan password tidak kosong
                if (!username.isEmpty() && !password.isEmpty()) {
                    // Buat Intent untuk berpindah ke halaman homepage
                    Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                    intent.putExtra("USERNAME", username);

                    // Pindah ke halaman homepage
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_atas, R.anim.slide_keluar_atas);
                } else {
                    // Jika kosong, tambahkan logika untuk menunjukkan error (misalnya dengan Toast)
                }
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_kiri, R.anim.slide_keluarkiri);
            }
        });
    }
}
