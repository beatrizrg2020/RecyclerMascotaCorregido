package com.example.mismascotasperritos;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorFavoritos extends RecyclerView.Adapter<AdaptadorFavoritos.ViewHolderFavoritos>{

    ArrayList<MascotasVo>mascotasVos;

     Activity activity;


    public AdaptadorFavoritos(ArrayList<MascotasVo> mascotasVos,Activity activity) {
        this.mascotasVos = mascotasVos;
        this.activity=activity;



    }
    public AdaptadorFavoritos() {

    }


    public class ViewHolderFavoritos extends RecyclerView.ViewHolder {

        private TextView tvNombreCV;
        ImageView imgFotoCV;
        ImageButton btnAumentarLikes;
        TextView tvLikesCv;

        public ViewHolderFavoritos(@NonNull View itemView) {
            super(itemView);

            tvNombreCV=(TextView)itemView.findViewById(R.id.tvNombreCV);
            imgFotoCV=(ImageView)itemView.findViewById(R.id.imgFotoCV);
            btnAumentarLikes=(ImageButton)itemView.findViewById(R.id.btnAumentarLikes);
            tvLikesCv=(TextView)itemView.findViewById(R.id.tvLikesCv);
        }
    }
   

    @NonNull
    @Override
    public ViewHolderFavoritos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mascotas,parent,false);

        return new ViewHolderFavoritos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFavoritos holder, int position) {

        final MascotasVo mascotasVo = mascotasVos.get(position);

        holder.imgFotoCV.setImageResource(mascotasVo.getFoto());
        holder.tvNombreCV.setText(mascotasVo.getNombre());
       // holder.btnAumentarLikes.setImageResource(mascotasVo.getLikes());
        holder.tvLikesCv.setText("" + mascotasVo.getLikes());

    }

    @Override
    public int getItemCount() {
        return mascotasVos.size();
    }





}
