package teachArray;

import java.util.Scanner;

public class edit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Nhập số phần tử trong mảng: ");
    int n = sc.nextInt();
    
    int[] arr = new int[n];
    
    System.out.println("Nhập phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    
    System.out.print("Nhập vị trí phần tử muốn sửa: ");
    int index = sc.nextInt();
    
    System.out.print("Nhập giá trị mới cho phần tử: ");
    int value = sc.nextInt();
    
    // Sửa phần tử trong mảng
    arr[index] = value;
    
    // In mảng mới
    System.out.println("Mảng sau khi sửa phần tử: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    
    sc.close();
  }
}
