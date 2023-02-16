package teachArray;
// in ra các phần tử của mảng
public class bai6 {
    public static void main(String[] args) {
    
        int [] num = {1,2,3,4};
        int [] arr = new int [4];
        arr[0] = 4;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 1;
        for (int i = 0; i < num.length; i++) {
            System.out.println(i + " : " + arr[i]);
            
        }
    }
    
}
