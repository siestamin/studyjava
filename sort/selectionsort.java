package sort;

import java.util.Scanner;

public class selectionsort {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }  selectionSort(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
      }
      public static void selectionSort ( int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
              for (int j = i + 1; j < arr.length; j++) {
                if ( arr[j] < arr[min]) {
                    min = j;
                }
              } int temp = arr[i];
              arr[i] = arr[min];
              arr[min] = temp;
        }
      }
}
