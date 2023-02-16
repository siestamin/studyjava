package teachArray; 
import java.util.Scanner;

/* nhập vào một mảng kiểm tra số lượng ký tự khác nhau trong mảng
VD: chuỗi abcdab in ra 2a 2b 1c 1d
sử dụng hàm split để chuyển chuỗi thành mảng. */
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String str = scanner.nextLine();

        String[] arr = str.split("");
        int[] count = new int[26];
        for (String s : arr) {
            char c = s.charAt(0);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println((char)(i + 'a') + " " + count[i]);
            }
        }
    }
}
