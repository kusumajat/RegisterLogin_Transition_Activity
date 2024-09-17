package com.example.registerlogin;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView tvWelcomeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvWelcomeMessage = findViewById(R.id.tvWelcomeMessage);

        // Ambil data yang dikirim dari halaman register
        String username = getIntent().getStringExtra("USERNAME");
        String email = getIntent().getStringExtra("EMAIL");
        String phone = getIntent().getStringExtra("PHONE");
        String password = getIntent().getStringExtra("PASSWORD");

        // Tampilkan data pada TextView
        String welcomeMessage = "Welcome " + username + "\nYour email has been activated: " + email + "\nYour phone has been registered: " + phone;
        tvWelcomeMessage.setText(welcomeMessage);
    }
}
