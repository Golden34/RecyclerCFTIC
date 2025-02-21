package edu.cftic.myrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AdapterLibros extends RecyclerView.Adapter<LibroViewHolder> {

    private ArrayList<Libro> datos;

    //Creo la vista, con el Holder dentro
    @Override
    public LibroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LibroViewHolder libroViewHolder = null;

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.layout_libro_item, parent, false);
        libroViewHolder = new LibroViewHolder(itemView);

        return libroViewHolder;
    }

    //Al holder, le meto la info de libro que toca
    @Override
    public void onBindViewHolder(LibroViewHolder holder, int position) {

        Libro libro = datos.get(position);
        holder.cargarLibroEnHolder(libro);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public AdapterLibros (ArrayList<Libro> libros)
    {
        this.datos = libros;
    }
}
