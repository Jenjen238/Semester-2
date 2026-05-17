package MODUL11_CollectionSortingAndSearching;

import java.util.ArrayList;

public class BinarySearch {
    public static int jumlahData(ArrayList<Integer> data, int target) {
        int jumlah = 0;
        int left = 0;
        int right = data.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data.get(mid) == target) {
                jumlah++;
                int i = mid - 1;
                while (i >= 0 && data.get(i) == target) {
                    jumlah++;
                    i--;
                }
                i = mid + 1;
                while (i < data.size() && data.get(i) == target) {
                    jumlah++;
                    i++;
                }
                return jumlah;
            }
            if (data.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
    public static boolean cariData(ArrayList<Integer> data, int target) {
        int left = 0;
        int right = data.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data.get(mid) == target) {
                return true;
            }
            if (data.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}