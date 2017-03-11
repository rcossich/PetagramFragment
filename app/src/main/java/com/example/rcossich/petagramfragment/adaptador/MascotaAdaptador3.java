package com.example.rcossich.petagramfragment.adaptador;

/**
 * Created by rcossich on 09/03/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rcossich.petagramfragment.pojo.Mascota_POJO;
import com.example.rcossich.petagramfragment.R;

import java.util.ArrayList;

/**
 * Created by rcossich on 09/03/2017.
 */

public class MascotaAdaptador3 extends RecyclerView.Adapter<MascotaAdaptador3.MascotaViewHolder>{

    ArrayList<Mascota_POJO> mascotas;

    public MascotaAdaptador3(ArrayList<Mascota_POJO> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota3,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, final int position) {
        final Mascota_POJO mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto3.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvLikes3.setText(""+mascota.getCantidad_likes());
    }


    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView   imgFoto3;
        private TextView    tvLikes3;
        private ImageView   ivTlikes3;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto3  = (ImageView)   itemView.findViewById(R.id.imgFoto3);
            tvLikes3  = (TextView)    itemView.findViewById(R.id.tvLikes3);
            ivTlikes3 = (ImageView)   itemView.findViewById(R.id.ivTlikes3);
        }
    }
}
