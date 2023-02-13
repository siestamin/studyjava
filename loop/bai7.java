package teachloop;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("uoc cua " + n + " la: ");
        for (int i = 1; i <=n; i++) {
            if ( n % i == 0 ) {
                System.out.print(i + " ");
            }
        }
    }
    
}
