package com.e.inclassrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.e.inclassrecyclerview.Adapter.MahasiswaAdapter;
import com.e.inclassrecyclerview.Model.Mahasiswa;

import java.util.ArrayList;

public class RecyclerVIewActivity extends AppCompatActivity {
    /*private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        
        /*addData();
        recyclerView = findViewById(R.id.mahasiswarv);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);*/
    }

    /*private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Scorpie Milo","123456789","1414370309"));
    }*/
}
