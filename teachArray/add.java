package teachArray;
 import java.util.Scanner;

public class add {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Nhập số phần tử trong mảng: ");
    int n = sc.nextInt();
    
    int[] arr = new int[n];
    
    System.out.println("Nhập phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    
    System.out.print("Nhập phần tử muốn thêm: ");
    int x = sc.nextInt();
    
    // Thêm phần tử vào mảng
    int[] newArr = new int[n + 1];
    for (int i = 0; i < n; i++) {
      newArr[i] = arr[i];
    }
    newArr[n] = x;
    
    // In mảng mới
    System.out.println("Mảng sau khi thêm phần tử: ");
    for (int i = 0; i < newArr.length; i++) {
      System.out.print(newArr[i] + " ");
    }
    
    sc.close();
  }
}




// Bài 1 : Tạo mảng số ngyên dương có n phần tử . Nhập vào một số  nguyên dương x và thêm x vào cuối mảng.
// Bài 2 : Tạo mảng số nguyên dương gồm n phần tử. Nhập vào 1 số nguyên dương x và xóa phần tử tại vị trí k.
// Bài 3 : Tạo mảng số nguyên dương có n phần tử. Nhập vào 1 số nguyên dương x và số nguyên dương y. Thêm y vào vị trí x của mảng.































