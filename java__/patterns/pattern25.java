package javaapplication3;
import java.util.*;

// for n=4
// 1 2 3 4 
// 2 3 4 1
// 3 4 1 2
// 4 1 2 3

public class pattern3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=0;i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print( (((j+i)%n)+1)+" ");
            }
            System.out.println();
        }
    }
    
}
