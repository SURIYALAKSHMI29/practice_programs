package javaapplication3;
import java.util.*;

// n=5

//         0 
//       1 0 1
//     2 1 0 1 2
//   3 2 1 0 1 2 3
// 4 3 2 1 0 1 2 3 4

public class pattern6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=1;i<=n; i++){
            for(int j=0; j<(2*(n-i)); j++){
                System.out.print(" ");
            }
            for(int j=i-1; j>=0; j--){
                System.out.print(j+" ");
            }
            for(int j=1; j<i; j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
