package teachArray; 
import java.util.Scanner;
public class bai1{
    /* Khai báo mảng cú pháp
     * c1 : <kiểu dữ liệu> <var-name> [];
     * c2 : <kiểu dữ liệu> [] <var-name>;
     * ví dụ khai báo một mảng gồm N phần tử
     * int newArray[]; OR int[] newArray;
     * ví dụ về khai báo mảng của các kiểu dữ liệu khác
     * byte byteArray[]
     * short shortsArray[];
     * boolean booleanArray[];
     * long longArray[];
     * float floatArray[];
     * double doubleArray[];
     * char charArray[];
     *  an array of references to objects of
     *  the class MyClass (a class created by user)
MyClass myClassArray[]; 

Object[]  ao,        // array of Object
Collection[] ca;  // array of Collection
                     // of unknown type
     * 
     * 
     *đó là khai báo mảng
     Giờ là khởi tạo mảng cú pháp như sau:
     <var-name> = new type [size] // size là chiều dài của mảng được tạo thành
     ví dụ : int newArray[]; // đây là khai báo mảng
            newArray[] = new int[20] // khởi tạo mảng gồm 20 phần tử.
            cách 2 khởi tạo mảng hay dùng.
            <kieur dữ liệu> <var-name> = new int[];
            int[] newArray = new int[20];

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    int[] arr = new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.print("Nhập giá trị cho arr[" + i + "]: ");
      arr[i] = scanner.nextInt();
    }
    int tong = 0;
    for (int i = 0; i < arr.length; i++) {
      tong+=arr[i];
    }
    System.out.println("tong = " +tong);
    }
}
    

