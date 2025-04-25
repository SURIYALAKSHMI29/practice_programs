package javaapplication3;
import java.util.*;

// for n=5
//  
//   1   5
//    2 4
//     3
//    2 4
//   1   5

public class pattern5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=1;i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==i || j==(n-i)+1){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
