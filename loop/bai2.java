package teachloop;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // ước chung lớn nhất
        for (int i = a; i >=1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            } 
            /* bội chung nhỏ nhất = tích 2 số chia cho ucln */
        } for (int j = a; j >=1; j--) {
            if (a % j == 0 && b % j == 0) {
                System.out.println(a* b /j);
                break;
            }
        }
    }
}
