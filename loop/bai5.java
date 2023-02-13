package teachloop;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum  = 0;
        for (int i = 1; i <= n; i++) {
            if ( i % 2 == 1 ) {
                sum+=0;
                System.out.print(i + " ");
            }
        } System.out.println(); 
        for (int i = 1; i <= n; i++) {
            if ( i % 2 == 0) {
                sum+=0;
                System.out.print(i + " ");
            }
        }
    }
    
}
