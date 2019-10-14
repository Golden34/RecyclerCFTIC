package edu.cftic.myrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class LibroViewHolder extends RecyclerView.ViewHolder {

    private TextView text_view_titulo;
    private TextView text_view_autor;

    public LibroViewHolder (View itemView) {

        super(itemView);
        text_view_autor = (TextView)itemView.findViewById(R.id.LblAutor);
        text_view_titulo = (TextView)itemView.findViewById(R.id.LblTitulo);
    }

    public void cargarLibroEnHolder(Libro l) {
        text_view_titulo.setText(l.getTitulo());
        text_view_autor.setText(l.getAutor());
    }
}
