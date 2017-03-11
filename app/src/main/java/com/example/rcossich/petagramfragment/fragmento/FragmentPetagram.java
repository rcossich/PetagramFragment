package com.example.rcossich.petagramfragment.fragmento;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rcossich.petagramfragment.R;
import com.example.rcossich.petagramfragment.adaptador.MascotaAdaptador;
import com.example.rcossich.petagramfragment.pojo.Mascota_POJO;

import java.util.ArrayList;

/**
 * Created by rcossich on 10/03/2017.
 */

public class FragmentPetagram extends Fragment {


    ArrayList<Mascota_POJO> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_petagram,container,false); //equivale a asignarle la clase al layout

        /*Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);*/

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }
    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota_POJO>();
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_01,"Mascota 01",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_02,"Mascota 02",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_03,"Mascota 03",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_04,"Mascota 04",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_05,"Mascota 05",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_06,"Mascota 06",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_07,"Mascota 07",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_08,"Mascota 08",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_09,"Mascota 09",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_10,"Mascota 10",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_11,"Mascota 11",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_12,"Mascota 12",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_13,"Mascota 13",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_14,"Mascota 14",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_15,"Mascota 15",0));

    }

}
