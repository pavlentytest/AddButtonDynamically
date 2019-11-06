package com.samsung.myitschool.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout lr = findViewById(R.id.root);
        Button btn = new Button(this);
        btn.setText("Ok");
        lr.addView(btn,0);
    }
}
