package com.example.myapplication;

import android.os.Bundle;
import android.view.ViewStub;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Đổi layout để thử nghiệm từng trường hợp
         setContentView(R.layout.layout_relativelayout);
        // setContentView(R.layout.layout_linearlayout_nested);
        // setContentView(R.layout.layout_viewstub);
        //setContentView(R.layout.layout_merge_main);
    }
}



