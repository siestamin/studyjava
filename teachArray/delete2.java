package teachArray;

import java.util.Scanner;

public class delete2 {
  public static int[] removeElement(int[] numbers, int index) {
    for (int i = index; i < numbers.length - 1; i++) {
      numbers[i] = numbers[i + 1];
    }

    int[] newNumbers = new int[numbers.length - 1];
    for (int i = 0; i < newNumbers.length; i++) {
      newNumbers[i] = numbers[i];
    }

    return newNumbers;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập số lượng phần tử: ");
    int length = scanner.nextInt();

    int[] numbers = new int[length];
    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
      numbers[i] = scanner.nextInt();
    }

    System.out.print("Nhập chỉ số của phần tử muốn xóa: ");
    int index = scanner.nextInt();

    int[] newNumbers = removeElement(numbers, index);

    System.out.println("Mảng sau khi xóa phần tử:");
    for (int i = 0; i < newNumbers.length; i++) {
      System.out.println(newNumbers[i]);
    }
  }
}
