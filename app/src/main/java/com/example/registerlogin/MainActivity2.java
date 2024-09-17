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

        // Mengambil data yang dikirim dari halaman register dan login
        String username = getIntent().getStringExtra("USERNAME");

        // Menampilkan data pada TextView
        String welcomeMessage = "Welcome " + username + "\nYour email has been activated \nYour phone has been registered";
        tvWelcomeMessage.setText(welcomeMessage);
    }
}
