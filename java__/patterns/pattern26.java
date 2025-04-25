package javaapplication3;
import java.util.*;

// for n=4
//  
//       1
//     2 1
//   3 2 1 
// 4 3 2 1

public class pattern4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=1;i<=n; i++){
            for(int j=0; j<(2*(n-i)); j++){
                System.out.print(" ");
            }
            for(int j=i; j>0; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
