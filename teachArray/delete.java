package teachArray;

import java.util.Scanner;

public class delete
 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Nhập số phần tử trong mảng: ");
    int n = sc.nextInt();
    
    int[] arr = new int[n];
    
    System.out.println("Nhập phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    
    System.out.print("Nhập vị trí phần tử muốn xóa: ");
    int index = sc.nextInt();
    
    // Xóa phần tử trong mảng
    int[] newArr = new int[n - 1];
    for (int i = 0, j = 0; i < n; i++) {
      if (i != index) {
        newArr[j++] = arr[i];
      }
    }
    
    // In mảng mới
    System.out.println("Mảng sau khi xóa phần tử: ");
    for (int i = 0; i < newArr.length; i++) {
      System.out.println(newArr[i]);
    }
    
    sc.close();
  }
}
