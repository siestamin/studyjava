package teachArray;

import java.util.Scanner;

public class search {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Nhập số phần tử trong mảng: ");
    int n = sc.nextInt();
    
    int[] arr = new int[n];
    
    System.out.println("Nhập phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    
    System.out.print("Nhập giá trị muốn tìm: ");
    int value = sc.nextInt();
    
    int index = -1;
    // Tìm kiếm phần tử trong mảng
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == value) {
        index = i;
        break;
      }
    }
    
    if (index == -1) {
      System.out.println("Không tìm thấy phần tử trong mảng.");
    } else {
      System.out.println("Tìm thấy phần tử tại vị trí " + index);
    }
    
    sc.close();
  }
}

