package edu.cftic.myrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recView;
    private ArrayList<Libro> datos;
    private AdapterLibros adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datos = new ArrayList<Libro>();
        Libro libro_aux = null;

        for (int i = 0; i < 20; i++) {
            libro_aux = new Libro("Libro " + i, " Autor " + i);
            datos.add(libro_aux);
        }

        recView = (RecyclerView) findViewById(R.id.RecView);
        //recView.setHasFixedSize(true);//opcional, si sé que el tamaño no va a cambiar

        adaptador = new AdapterLibros(datos);
        recView.setAdapter(adaptador);
        recView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        //recView.setLayoutManager(new GridLayoutManager(this,3));
        //StaggeredGridLayoutManager para celdas de tamaño variable
        //recView.setLayoutManager(new StaggeredGridLayoutManager());

        //ITEM DECORATOR --> OPCIONAL

        recView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
