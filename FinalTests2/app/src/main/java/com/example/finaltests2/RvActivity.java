package com.example.finaltests2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import modele.Personne;

public class RvActivity extends AppCompatActivity {
    private Service service;
    ItemAdapter adapter;
    RecyclerView rv;
    Personne personne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);
        this.setTitle("final-recycler");

        service = new Service();

        btnFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });


        this.initRv();
        this.remplirRv();
    }

    private void initRv() {
        rv =  findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rv.findViewById(R.id.btnSupprimer);
        adapter = new ItemAdapter();
        rv.setAdapter(adapter);

    }

    private void remplirRv() {
        for (int i = 0; i <= 100; i++) {
            personne = new Personne();
            personne.Nombre = String.valueOf(i);
            adapter.list.add(personne);
        }
        adapter.notifyDataSetChanged();
    }
}