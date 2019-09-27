package com.e.inclassrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.e.inclassrecyclerview.Adapter.MahasiswaAdapter;
import com.e.inclassrecyclerview.Model.Mahasiswa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView = findViewById(R.id.mahasiswarv);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Scorpie Milo","123456789","1414370309"));
        mahasiswaArrayList.add(new Mahasiswa("Sagitarius Aiolos","987654321","1214234560"));
        mahasiswaArrayList.add(new Mahasiswa("Libra Dohko","098758124","1214230345"));
        mahasiswaArrayList.add(new Mahasiswa("Aries Mu","098758124","1214378098"));
        mahasiswaArrayList.add(new Mahasiswa("Gemini Saga","123456789","1414370309"));
        mahasiswaArrayList.add(new Mahasiswa("Aquarius Camus","987654321","1214234560"));
        mahasiswaArrayList.add(new Mahasiswa("Cancer Deathmask","987648765","1214230345"));
        mahasiswaArrayList.add(new Mahasiswa("Leo Aiolia","098758124","1214378098"));
        mahasiswaArrayList.add(new Mahasiswa("Virgo Shaka","123456789","1414370309"));
        mahasiswaArrayList.add(new Mahasiswa("Taurus Aldebaran","987654321","1214234560"));
        mahasiswaArrayList.add(new Mahasiswa("Pisces Aphrodite","987648765","1214230345"));
        mahasiswaArrayList.add(new Mahasiswa("Capricorn Shura","098758124","1214378098"));

    }
}
