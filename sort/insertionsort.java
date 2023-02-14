package sort;

import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        } insertionSort(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertionSort ( int [] arr , int n) {
        for (int i = 0; i < n; i++) {
            int value = arr[i];
            int j = i - 1;
            while ( j >= 0 && value < arr[j] ) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = value;
        } 
    }
}
