package com.kuliah.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailProkerActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_proker);

        ImageView fotoProker = findViewById(R.id.foto_proker);
        TextView textNama = findViewById(R.id.text_nama_proker);
        TextView textDeskripsi = findViewById(R.id.text_deskripsi_proker);

        Proker proker = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(proker != null){
            Glide.with(this)
                    .load(proker.getFoto())
                    .into(fotoProker);
            textNama.setText(proker.getNama());
            textDeskripsi.setText(proker.getDeskripsi());
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Program Kerja");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}