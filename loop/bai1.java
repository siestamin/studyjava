package teachloop;

import java.util.Scanner;

public class bai1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int tong = n*(n+1 )/ 2;
        System.out.println(tong);
    }
}