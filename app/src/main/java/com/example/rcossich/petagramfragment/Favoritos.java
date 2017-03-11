package com.example.rcossich.petagramfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import com.example.rcossich.petagramfragment.adaptador.MascotaAdaptador2;
import com.example.rcossich.petagramfragment.pojo.Mascota_POJO;


/**
 * Created by rcossich on 08/03/2017.
 */

public class Favoritos extends AppCompatActivity {

    ArrayList<Mascota_POJO> mascotas2;
    private RecyclerView listaMascotas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listaMascotas2 = (RecyclerView) findViewById(R.id.rvMascotas2);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas2.setLayoutManager(llm);
        inicializarListaMascotas2();
        inicializarAdaptador2();
    }
    /*
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_opciones,menu);
            return true;
        }
    */
    public void inicializarAdaptador2(){
        MascotaAdaptador2 adaptador = new MascotaAdaptador2(mascotas2);
        listaMascotas2.setAdapter(adaptador);
    }
    public void inicializarListaMascotas2() {
        mascotas2 = new ArrayList<Mascota_POJO>();
        mascotas2.add(new Mascota_POJO(R.drawable.dog_pet_02,"Mascota 02",9));
        mascotas2.add(new Mascota_POJO(R.drawable.dog_pet_07,"Mascota 07",7));
        mascotas2.add(new Mascota_POJO(R.drawable.dog_pet_12,"Mascota 12",8));
        mascotas2.add(new Mascota_POJO(R.drawable.dog_pet_14,"Mascota 14",6));
        mascotas2.add(new Mascota_POJO(R.drawable.dog_pet_15,"Mascota 15",2));

    }
}
