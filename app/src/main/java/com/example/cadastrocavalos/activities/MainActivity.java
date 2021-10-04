package com.example.cadastrocavalos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cadastrocavalos.R;
import com.example.cadastrocavalos.adapter.CavaloAdapter;
import com.example.cadastrocavalos.controller.CavaloDao;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCavalos;
    FloatingActionButton fabCadastrar;
    CavaloDao cavaloDao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCavalos = findViewById(R.id.rvListaCavalos);
        cavaloDao = new CavaloDao();
        fabCadastrar = findViewById(R.id.fabCadastrar);

        fabCadastrar.setOnClickListener(view -> {
            startActivity(new Intent(this, CadastroActivity.class));
        });

        RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rvCavalos.setLayoutManager(layout);
    }

    @Override
    protected void onResume() {
        super.onResume();

        CavaloAdapter cavaloAdapter = new CavaloAdapter(this, cavaloDao);
        rvCavalos.setAdapter(cavaloAdapter);
    }
}