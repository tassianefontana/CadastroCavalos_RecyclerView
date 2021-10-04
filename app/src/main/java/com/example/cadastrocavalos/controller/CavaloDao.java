package com.example.cadastrocavalos.controller;

import com.example.cadastrocavalos.model.Cavalo;

import java.util.ArrayList;
import java.util.List;

public class CavaloDao {

    private static List<Cavalo> listaCavalos = new ArrayList<>();

    public void addCavalos(Cavalo cavalo){
        listaCavalos.add(cavalo);
    }

    public static Cavalo getCavalo(int position){
        return listaCavalos.get(position);
    }

    public static List<Cavalo> getListaCavalos(){
        return listaCavalos;
    }


}
