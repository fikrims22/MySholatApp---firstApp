package com.example.me.mysholatapp;

import java.util.ArrayList;

/**
 * Created by ME on 24/12/2017.
 */

public class SholatData {
    public static String[][] data = new String[][]{
            {"Berdiri","Gerakan 1","https://codeyoo.000webhostapp.com/satu.png","Berdiri sempurna Merupakan salah satu syarat sholat bagi yang mampu melakukannya, kalaupun tidak diperbolehkan untuk duduk"},
            {"Takbiratul Ikhram","Gerakan 2","https://codeyoo.000webhostapp.com/dua.png","Takbiratul Ihram adalah gerakan pertama dalam sholat yang mengangkat kedua tangan hingga ke daun telinga"},
            {"Sidekap","Gerakan 3","https://codeyoo.000webhostapp.com/tiga.png","Dalam gerakan sidekap membaca do'a iftitah dilanjutkan membaca syrat Al Fatihah dan Surat pendek"},
            {"Ruku","Gerakan 4","https://codeyoo.000webhostapp.com/empat.png","Setalah membaca suart pendek lalu gerakan selanjutnya adalah ruku membungkukan badan dengan posisi 90 derajat dan membaca do'a ruku"},
            {"Sujud","Gerakan 5","https://codeyoo.000webhostapp.com/lima.png","Gerakan sujud adalah gerakan yang anggota badan lain harus menempel ke permukaan yaitu kaki bagian bawah, lutut, telapak tangan dan dahi dan membaca do'a sujud"},
            {"Duduk diantara dua sujud","Gerakan 6","https://codeyoo.000webhostapp.com/enam.png","Duduk diantara dua sujud adalah gerakan sesudah sujud pertama dan membaca do'a duduk diantara dua sujud"},
            {"Tasyahud","Gerakan 7","https://codeyoo.000webhostapp.com/tujuh.png","Tasyahud dibagi dua yaitu tasyahud awal dan akhir. Tasyahud awal dilakukan setiap 2 raka'at pertama kecuali sholat shubuh langsung tasyahud akhir. Perbedaannya adalah tasyahud awal hanya membaca sampai sholawat nabi Muhammad SAW, jika tasyahud akhir membaca sampai innaka hamiidum mazid"},
            {"Salam","Gerakan 8","https://codeyoo.000webhostapp.com/delapan.png","salam adalah gerakan terkahir dalam sholat"},
    };


    public static ArrayList<Sholat> getListData(){
            Sholat sholat = null;
            ArrayList<Sholat> list = new ArrayList<>();
            for (int i = 0; i < data.length; i++){
                sholat = new Sholat();
                sholat.setNama(data[i][0]);
                sholat.setGerakan(data[i][1]);
                sholat.setFoto(data[i][2]);
                sholat.setText_detail(data[i][3]);

                list.add(sholat);

            }
            return list;
    };

}
