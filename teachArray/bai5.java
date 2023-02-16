package teachArray; 

import java.util.Scanner;
// thêm phần tử vào mảng tại vị trí k.
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập phần tử muốn chèn: ");
        int value = scanner.nextInt();
        System.out.print("Nhập vị trí muốn chèn (từ 0 đến " + (n - 1) + "): ");
        int k = scanner.nextInt();

        for (int i = n; i > k; i--) {
            arr[i] = arr[i - 1];
        }
        arr[k] = value;
        n++;

        System.out.println("Mảng sau khi chèn: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
