package com.example.mismascotasperritos;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.Comparator;

public class MascotasVo implements Serializable {

    private String nombre;
    private int foto;
    private int likes=0;

    public MascotasVo(String nombre, int likes, int foto) {
        this.nombre=nombre;
        this.foto=foto;
        this.likes=likes;
    }


    public MascotasVo() {

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }



}
