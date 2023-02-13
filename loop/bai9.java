package teachloop;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isPrime = true;
        if ( n <=1 ) {
            
            System.out.println("k la so snt");
            
            
        } for (int i = 2; i < n; i++) {
            if ( n % i == 0) {
                isPrime = false;
                System.out.println("k phai la so snt");
                break;
            }
        } if (isPrime) {
            System.out.println("la snt");
        } 
    }
    
}
