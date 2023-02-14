package sort;

import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        } quickSort(arr,0, n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int partition( int[] arr,int left,int right) {
        int i = left - 1;
        int pivot = arr[right];
        for (int j = left; j < right; j++) {
            if ( arr[j] <= pivot){
                i++;
                int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
            
        }
        i++;
        int temp = arr[i];
        arr[i]=arr[right];
        arr[right] = temp;
        return i;
    }
    public static void quickSort ( int[]arr,int left,int right) {
        if ( left < right) {
            int index = partition(arr, left, right);
            quickSort(arr,left,index - 1);
            quickSort(arr, index + 1, right);
        }
    }
}
