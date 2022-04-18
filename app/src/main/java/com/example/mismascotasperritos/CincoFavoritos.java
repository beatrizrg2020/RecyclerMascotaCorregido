package com.example.mismascotasperritos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class CincoFavoritos extends AppCompatActivity {

    ArrayList<MascotasVo> mascotasVos=new ArrayList<MascotasVo>();
    ArrayList<MascotasVo> mascotasFavoritas=new ArrayList<MascotasVo>();
    //private RecyclerView rvMascotas;
    private RecyclerView rvMascotasFavoritos;

    Activity activity;

   // MainActivity ob1=new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco_favoritos);

        rvMascotasFavoritos=(RecyclerView)findViewById(R.id.rvMascotasFavoritos);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        rvMascotasFavoritos.setLayoutManager(llm);


        Intent i = getIntent();
        mascotasFavoritas = (ArrayList<MascotasVo>) i.getSerializableExtra("mascotas");
        //Toast.makeText(this, list.get(1).name, Toast.LENGTH_LONG).show();


        for (MascotasVo elemento:mascotasFavoritas) {

            System.out.println(elemento.getNombre());

        }

        //Bundle parametros=getIntent().getExtras();

        //parametros.putParcelableArrayList("mascotas", mascotasVos);

      /*  Intent i = getIntent();
        ArrayList<MascotasVo> list = (ArrayList<MascotasVo>) i
                .getSerializableExtra("list");

        for (MascotasVo elemento:list) {

            System.out.println(elemento.getNombre());

        }*/

        ///Toast.makeText(this, list.get(1).name, Toast.LENGTH_LONG).show();



                //mascotasVos
        //llenarListaCincoFavoritos();

        inicializarAdaptadorFavoritos();



    }
    void inicializarAdaptadorFavoritos() {
        AdaptadorFavoritos adaptadorFavoritos=new AdaptadorFavoritos(mascotasFavoritas,this);
        rvMascotasFavoritos.setAdapter(adaptadorFavoritos);

    }

    void llenarListaCincoFavoritos() { //metodo llenar lista


       /* mascotasVos2=new ArrayList<MascotasVo>();

        MascotasVo m1=new MascotasVo();
        m1.setNombre("Toby");
        m1.setFoto(R.drawable.perrito1);
        m1.setLikes(0);
        mascotasVos2.add(m1);

        MascotasVo m2=new MascotasVo();
        m2.setNombre("sol");
        m2.setFoto(R.drawable.perrito2);
        m2.setLikes(0);
        mascotasVos2.add(m2);*/

        /*  mascotasVos2.add(new MascotasVo("Toby",0,R.drawable.perrito1));
      mascotasVos2.add(new MascotasVo("Sol",0,R.drawable.perrito2));
        mascotasVos2.add(new MascotasVo("Zeus",0,R.drawable.perrito3));
        mascotasVos2.add(new MascotasVo("Luna",0,R.drawable.perrito4));
        mascotasVos2.add(new MascotasVo("Estrella",0,R.drawable.perrito5));
        mascotasVos2.add(new MascotasVo("Tony",0,R.drawable.perrito6));
        mascotasVos2.add(new MascotasVo("Ciprix",0,R.drawable.perrito7));
        mascotasVos2.add(new MascotasVo("Yerry",0,R.drawable.perrito8));*/


    }
}