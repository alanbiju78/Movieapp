package com.example.movieapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ScrollView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText mname, aname, acname, yor, lang, gross, dname, pname, pcname;
    AppCompatButton subbt, vallbt;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        mname = findViewById(R.id.mname);
        aname = findViewById(R.id.aname);
        acname = findViewById(R.id.acname);
        yor = findViewById(R.id.yor);
        lang = findViewById(R.id.lang);
        gross = findViewById(R.id.gross);
        dname = findViewById(R.id.dname);
        pname = findViewById(R.id.pname);
        pcname = findViewById(R.id.pcname);
        subbt = findViewById(R.id.subbt);
        vallbt = findViewById(R.id.vallbt);

    }
}