package com.example.hui.myjnitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyJni myJni = new MyJni();
        Toast.makeText(this, "1+3=" + myJni.add(1, 3), Toast.LENGTH_LONG).show();
    }
}
