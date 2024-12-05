package com.example.myapplication;

import android.os.Bundle;
import android.view.ViewStub;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class CodeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_viewstub);

        // Tìm ViewStub và Button
        ViewStub stub = findViewById(R.id.stub);
        Button loadButton = findViewById(R.id.loadButton);

        // Tải động ViewStub khi nhấn nút
        loadButton.setOnClickListener(v -> {
            if (stub != null) {
                stub.inflate(); // Inflate layout động
            }
        });
    }
}