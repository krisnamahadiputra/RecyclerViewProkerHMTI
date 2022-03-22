package com.kuliah.recyclerviewproject;

import android.os.Parcel;
import android.os.Parcelable;

public class Proker implements Parcelable {
    private String nama;
    private String deskripsi;
    private int foto;

    public Proker(){

    }

    protected Proker(Parcel in) {
        nama = in.readString();
        deskripsi = in.readString();
        foto = in.readInt();
    }

    public static final Creator<Proker> CREATOR = new Creator<Proker>() {
        @Override
        public Proker createFromParcel(Parcel in) {
            return new Proker(in);
        }

        @Override
        public Proker[] newArray(int size) {
            return new Proker[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(deskripsi);
        parcel.writeInt(foto);
    }
}
