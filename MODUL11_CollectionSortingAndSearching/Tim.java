package MODUL11_CollectionSortingAndSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Tim {
    private String namaTim;
    private ArrayList<Pemain> pemainList;

    public Tim(String namaTim) {
        this.namaTim = namaTim;
        pemainList = new ArrayList<>();
    }

    public void tambahPemain(Pemain p) {
        pemainList.add(p);
    }

    public ArrayList<Pemain> getPemainList() {
        return pemainList;
    }

    public void tampilkanData() {
        System.out.println("\nData " + namaTim);
        for (Pemain p : pemainList) {
            System.out.println(p);
        }
    }

    // Sorting Tinggi Ascending
    public void sortTinggiAsc() {
        pemainList.sort(Comparator.comparingInt(Pemain::getTinggi));
    }

    // Sorting Tinggi Descending
    public void sortTinggiDesc() {
        pemainList.sort(Comparator.comparingInt(Pemain::getTinggi).reversed());
    }

    // Sorting Berat Ascending
    public void sortBeratAsc() {
        pemainList.sort(Comparator.comparingInt(Pemain::getBerat));
    }

    // Sorting Berat Descending
    public void sortBeratDesc() {
        pemainList.sort(Comparator.comparingInt(Pemain::getBerat).reversed());
    }

    // Tinggi maksimum
    public int maxTinggi() {
        int max = pemainList.get(0).getTinggi();

        for (Pemain p : pemainList) {
            if (p.getTinggi() > max) {
                max = p.getTinggi();
            }
        }
        return max;
    }

    // Tinggi minimum
    public int minTinggi() {
        int min = pemainList.get(0).getTinggi();

        for (Pemain p : pemainList) {
            if (p.getTinggi() < min) {
                min = p.getTinggi();
            }
        }
        return min;
    }

    // Berat maksimum
    public int maxBerat() {
        int max = pemainList.get(0).getBerat();

        for (Pemain p : pemainList) {
            if (p.getBerat() > max) {
                max = p.getBerat();
            }
        }
        return max;
    }

    // Berat minimum
    public int minBerat() {
        int min = pemainList.get(0).getBerat();

        for (Pemain p : pemainList) {
            if (p.getBerat() < min) {
                min = p.getBerat();
            }
        }
        return min;
    }

    // Copy tim
    public Tim copyTim(String namaBaru) {
        Tim copy = new Tim(namaBaru);

        for (Pemain p : pemainList) {
            copy.tambahPemain(new Pemain(
                    p.getNo(),
                    p.getTinggi(),
                    p.getBerat()
            ));
        }
        return copy;
    }

    // Ambil data tinggi
    public ArrayList<Integer> getDaftarTinggi() {
        ArrayList<Integer> list = new ArrayList<>();

        for (Pemain p : pemainList) {
            list.add(p.getTinggi());
        }
        Collections.sort(list);
        return list;
    }

    // Ambil data berat
    public ArrayList<Integer> getDaftarBerat() {
        ArrayList<Integer> list = new ArrayList<>();

        for (Pemain p : pemainList) {
            list.add(p.getBerat());
        }
        Collections.sort(list);
        return list;
    }

}