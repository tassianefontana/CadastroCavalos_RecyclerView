package com.example.cadastrocavalos.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cadastrocavalos.R;
import com.example.cadastrocavalos.controller.CavaloDao;
import com.example.cadastrocavalos.model.Cavalo;

public class CavaloAdapter extends RecyclerView.Adapter {

    private Context context;
    private CavaloDao cavaloDao;

    public CavaloAdapter(Context context, CavaloDao cavaloDao) {
        this.context = context;
        this.cavaloDao = cavaloDao;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewCavalo = LayoutInflater.from(context).inflate(R.layout.layout_cavalo, parent, false);
        CavaloViewHolder cavaloViewHolder = new CavaloViewHolder(viewCavalo);

        return cavaloViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CavaloViewHolder cavaloViewHolder = (CavaloViewHolder) holder;
        Cavalo cavalo = CavaloDao.getCavalo(position);
        cavaloViewHolder.nome.setText(cavalo.getNome());
        cavaloViewHolder.raca.setText("Raça:" + cavalo.getRaca());
        cavaloViewHolder.genero.setText("Gênero: " + cavalo.getGenero());
        cavaloViewHolder.dataNascimento.setText("Data de nascimento: " + cavalo.getDataNascimento());
        if (cavalo.isCastrado()) {
            cavaloViewHolder.castrado.setText("Castrado: Sim");
        } else {
            cavaloViewHolder.castrado.setText("Castrado: Não");
        }

    }

    @Override
    public int getItemCount() {
        return cavaloDao.getListaCavalos().size();
    }
}
