package MODUL11_CollectionSortingAndSearching;

public class TugasPrak {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr);
        System.out.println("Array yang sudah diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int [] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Tukar arr[j] dan arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        while (left <= right){
            int mid = left + (right - left) /2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1; // Target not found
    }
}
