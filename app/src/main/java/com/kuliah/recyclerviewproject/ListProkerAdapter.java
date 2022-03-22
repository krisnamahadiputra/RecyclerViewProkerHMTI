package com.kuliah.recyclerviewproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;


public class ListProkerAdapter extends RecyclerView.Adapter<ListProkerAdapter.ListViewHolder> {
    private ArrayList<Proker> listProker;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListProkerAdapter(ArrayList<Proker> list){
        this.listProker = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Proker proker = listProker.get(position);
        Glide.with(holder.itemView.getContext())
                .load(proker.getFoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgFoto);
        holder.textNama.setText(proker.getNama());
        holder.textDeskripsi.setText(proker.getDeskripsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listProker.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listProker.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView textNama, textDeskripsi;

        ListViewHolder(View itemview) {
            super(itemview);
            imgFoto = itemview.findViewById(R.id.img_item_proker);
            textNama = itemview.findViewById(R.id.text_item_name);
            textDeskripsi = itemview.findViewById(R.id.text_deskripsi);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Proker data);
    }
}
