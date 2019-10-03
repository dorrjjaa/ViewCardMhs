package com.datamhs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.datamhs.Adapter.DaftartemanAdapter;
import com.datamhs.Model.DaftarTeman;

import java.util.ArrayList;

import static com.datamhs.R.id.RvDaftarTeman;

public class DaftarTemanActivity extends AppCompatActivity {
    private RecyclerView daftarTemanView;
    private DaftartemanAdapter daftarTemanAdapter;
    private ArrayList<DaftarTeman>daftarTemanArrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_teman);
        addData();
        daftarTemanView = findViewById(RvDaftarTeman);
        daftarTemanAdapter = new DaftartemanAdapter(daftarTemanArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DaftarTemanActivity.this);
        daftarTemanView.setLayoutManager(layoutManager);
        daftarTemanView.setAdapter(daftarTemanAdapter);


    }
    private void addData(){
        daftarTemanArrayList = new ArrayList<>();
        daftarTemanArrayList.add(new DaftarTeman("Angkie","72170146", "Laki-Laki","Tidur", "Atheist","Hidup Adalah Ngeluh", R.drawable.angkie));
        daftarTemanArrayList.add(new DaftarTeman("Alfadeo", "72170106", "Laki-Laki", "Musik", "Musisi", "Selalu Kuat",R.drawable.deo));
        daftarTemanArrayList.add(new DaftarTeman("Abdi","72170172","Laki-Laki","Gaming","Gamer Nakal","Makan",R.drawable.abdi));
        daftarTemanArrayList.add(new DaftarTeman("Alvin","72170128","Laki-Laki","Pelit","Pengusaha","Cuan Cuan",R.drawable.alvin));



    }
}
