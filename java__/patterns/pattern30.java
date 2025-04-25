package javaapplication3;
import java.util.*;

// n = 5

// 1 
// 2 4
// 3 5 7
// 6 8 10 12
// 9 11 13 15 17

public class pattern8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int even = 2;
        int odd = 1;
        int num = -1;
        for(int i=1;i<=n; i++){
            num=odd;
            if(i%2==0){
                num=even;
            }
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num+=2;
            }
            if(i%2==0){
                even=num;
            }
            else{
                odd=num;
            }
            System.out.println();
        }
    }
}
