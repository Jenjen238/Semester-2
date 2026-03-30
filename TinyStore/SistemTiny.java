package TinyStore;

import java.util.ArrayList;

public class SistemTiny {

    private ArrayList<Pelanggan> daftarPelanggan;

    public SistemTiny(){

        daftarPelanggan =
                new ArrayList<>();

    }

    public void tambahPelanggan(
            Pelanggan pelanggan){

        daftarPelanggan.add(pelanggan);

    }

    public Pelanggan cariPelanggan(
            String nomor){

        for(Pelanggan p : daftarPelanggan){

            if(p.getNomorPelanggan()
                    .equals(nomor)){

                return p;

            }

        }

        return null;
    }

}