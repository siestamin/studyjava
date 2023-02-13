package teachloop;

import java.util.Scanner;

// ví dụ 6 = 1 +2 +3 = 6=> là số hoàn hảo 
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if ( a % i == 0) {
                sum += i;
            }  
        } if ( sum == a) {
            System.out.println("la so hoan hao");
        } else {
            System.out.println("k la so hoan hao");
        }
    }
    
}
