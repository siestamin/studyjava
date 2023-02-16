package teachArray; 

import java.util.Scanner;

/* cách nhập mảng gồm n phần tử và khởi tạo mảng gồm n phần tử rồi in ra phần tử tại vị trí index */

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int[] a = new int[3];
       
        System.out.println(a);
        for (int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
        } for (int i = 0; i < a.length; i++) {
            System.out.println("phần tử  tại vị trí " + i + " : " + a[i]);
            
        } 
        }
    
}
