package com.example.cadastrocavalos.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cadastrocavalos.R;

public class CavaloViewHolder extends RecyclerView.ViewHolder {

    TextView nome;
    TextView raca;
    TextView dataNascimento;
    TextView genero;
    TextView castrado;

    public CavaloViewHolder(@NonNull View itemView) {
        super(itemView);

        nome = itemView.findViewById(R.id.tvNome);
        raca = itemView.findViewById(R.id.tvRaca);
        dataNascimento = itemView.findViewById(R.id.tvDataNascimento);
        genero = itemView.findViewById(R.id.tvGenero);
        castrado = itemView.findViewById(R.id.tvCastrado);
    }
}
