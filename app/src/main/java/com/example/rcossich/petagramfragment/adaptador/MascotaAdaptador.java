package com.example.rcossich.petagramfragment.adaptador;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rcossich.petagramfragment.pojo.Mascota_POJO;
import com.example.rcossich.petagramfragment.R;

import java.util.ArrayList;

/**
 * Created by rcossich on 08/03/2017.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota_POJO> mascotas;

    public MascotaAdaptador(ArrayList<Mascota_POJO> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, final int position) {
        final Mascota_POJO mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());

        mascotaViewHolder.btLike.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Mascota_POJO amascota = mascotas.get(position);
                int likes_ahora = amascota.getCantidad_likes()+1;
                amascota.setCantidad_likes(likes_ahora);
                mascotaViewHolder.tvLikes.setText(""+likes_ahora);
            }

        });

    }


    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView   imgFoto;
        private TextView    tvNombre;
        private ImageButton btLike;
        private TextView    tvLikes;
        private ImageView   ivTlikes;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto  = (ImageView)   itemView.findViewById(R.id.imgFoto);
            tvNombre = (TextView)    itemView.findViewById(R.id.tvNombre);
            btLike   = (ImageButton) itemView.findViewById(R.id.btLike);
            tvLikes  = (TextView)    itemView.findViewById(R.id.tvLikes);
            ivTlikes = (ImageView)   itemView.findViewById(R.id.ivTlikes);
        }
    }
}
