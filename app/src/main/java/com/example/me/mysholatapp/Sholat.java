package com.example.me.mysholatapp;

/**
 * Created by ME on 24/12/2017.
 */

public class Sholat {
    private String nama;
    private String gerakan;
    private String foto;
    private String text_detail;

//    public Sholat(String nama, String gerakan, String foto, String text_detail) {
//        this.nama = nama;
//        this.gerakan = gerakan;
//        this.foto = foto;
//        this.text_detail = text_detail;
//    }

    public String getText_detail() {
        return text_detail;
    }

    public void setText_detail(String text_detail) {
        this.text_detail = text_detail;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGerakan(){
        return gerakan;
    }

    public void setGerakan(String gerakan) {
        this.gerakan = gerakan;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
