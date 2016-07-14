package es.juanjo.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List mascotaList;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializaMascotas();
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerViewMain);
        this.recyclerView.setHasFixedSize(true);
        this.layoutManager = new LinearLayoutManager(this);
        this.recyclerView.setLayoutManager(this.layoutManager);
        this.adapter = new MascotaAdapter(this.mascotaList);
        this.recyclerView.setAdapter(this.adapter);
    }

    private void inicializaMascotas() {
        this.mascotaList = new ArrayList();
        this.mascotaList.add(new Mascota(R.drawable.perro1, "perrete 1", 0));
        this.mascotaList.add(new Mascota(R.drawable.perro2, "perrete 2", 0));
        this.mascotaList.add(new Mascota(R.drawable.perro3, "perrete 3", 0));
        this.mascotaList.add(new Mascota(R.drawable.perro4, "perrete 4", 0));
        this.mascotaList.add(new Mascota(R.drawable.perro5, "perrete 5", 0));
        this.mascotaList.add(new Mascota(R.drawable.perro6, "perrete 6", 0));
    }
}
