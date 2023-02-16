package teachArray; 
// in các phần tử trong mảng 
public class bai3 {
    public static void main(String[] args) {
        
       int[] a = {5,1,2};
        
       for (int i : a) {
        System.out.println(i);
       }
        for (int i=0; i<a.length; i++){
            System.out.println(i + ":" + a[i] );
        }
    }
    
}
