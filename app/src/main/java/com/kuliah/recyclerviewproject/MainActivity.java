package com.kuliah.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recylerProker;
    private ArrayList<Proker> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerProker = findViewById(R.id.recycler_proker);
        recylerProker.setHasFixedSize(true);

        list.addAll(DataProker.getlistData());
        showRecycLerList();
    }

    private void showRecycLerList(){
        recylerProker.setLayoutManager(new LinearLayoutManager(this));
        ListProkerAdapter listProkerAdapter = new ListProkerAdapter(list);
        recylerProker.setAdapter(listProkerAdapter);

        listProkerAdapter.setOnItemClickCallback(new ListProkerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Proker proker) {
                showSelectedProker(proker);
                Intent moveIntent = new Intent(MainActivity.this, DetailProkerActivity.class);
                moveIntent.putExtra(DetailProkerActivity.ITEM_EXTRA, proker);
                startActivity(moveIntent);
            }
        });
    }

    private void showSelectedProker(Proker proker){
        Toast.makeText(this, "Detail " + proker.getNama() + "...", Toast.LENGTH_SHORT).show();
    }


}