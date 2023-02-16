package teachArray;

import java.util.Scanner;
// in các phần tử và in ngc lại
public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        } for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        } System.out.println(); 
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
