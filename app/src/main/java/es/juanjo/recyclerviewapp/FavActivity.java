package es.juanjo.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class FavActivity extends AppCompatActivity {

    private List mascotaList;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);
        Toolbar actionBar = (Toolbar) findViewById(R.id.layoutActionBar);
        setSupportActionBar(actionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        inicializaMascotas();

        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerViewFav);
        this.recyclerView.setHasFixedSize(true);
        this.layoutManager = new LinearLayoutManager(this);
        this.recyclerView.setLayoutManager(this.layoutManager);
        this.adapter = new MascotaAdapter(this.mascotaList);
        this.recyclerView.setAdapter(this.adapter);
    }

    private void inicializaMascotas() {
        this.mascotaList = new ArrayList();
        this.mascotaList.add(new Mascota(R.drawable.perro2, "perrete 2", 0));
        this.mascotaList.add(new Mascota(R.drawable.perro4, "perrete 4", 0));
        this.mascotaList.add(new Mascota(R.drawable.perro6, "perrete 6", 0));
    }
}
