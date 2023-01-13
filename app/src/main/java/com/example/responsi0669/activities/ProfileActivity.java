package com.example.responsi0669.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.responsi0669.R;
import com.example.responsi0669.room.User;
import com.example.responsi0669.utils.PreferencesHelper;

public class ProfileActivity extends AppCompatActivity {

    private ImageView btnBack;
    private EditText etEmail, etName, etAddress, etPassword;
    private Button btnSave;

    private User user;
    private PreferencesHelper preferencesHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnBack = findViewById(R.id.btnBack);
        etEmail = findViewById(R.id.etEmail);
        etName = findViewById(R.id.etName);
        etAddress = findViewById(R.id.etAddress);
        etPassword = findViewById(R.id.etPassword);
        btnSave = findViewById(R.id.btnSave);

        preferencesHelper = PreferencesHelper.getInstance(getApplicationContext());

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}