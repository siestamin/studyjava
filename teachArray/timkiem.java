package teachArray;

import java.util.Scanner;

public class timkiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so phan tu : ");
        int n = scanner.nextInt();
        int [] arr =  new int[n];
        for (int i = 0; i < arr.length; i++) {
           System.out.print("arr["+i+"]:\t ");
           arr[i] = scanner.nextInt();
        } System.out.println("mang sau khi nhap la: "); 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("moi ban nhap vao phan tu muon tim\n");
        int k = scanner.nextInt();
        search(arr,k);

    
    }
    public static void search(int[] arr, int k) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == k) {
                flag = true;
                break;
            }
        } if ( flag == true ) {
            System.out.println("tim thay " + k + " trong mang");
        } else {
            System.out.println(" khong tim thay " + k + " trong mang");
        }

    }
    
}
