package sort;

import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        //k sử dụng hàm
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        } bubblesort(arr, n);
    
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void bubblesort ( int[] arr,int n) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < n - i -  1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }
    }
}
