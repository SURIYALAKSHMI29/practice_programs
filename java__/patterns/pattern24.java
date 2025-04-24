//   if n= 4

//   Expected Output:
//   1
//   2*3
//   4*5*6
//   7*8*9*10


import java.util.*;

public class pattern1 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int num = 1;
        for(int i=0;i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(num+"*");
                num++;
            }
            System.out.print(num);
            num++;
            System.out.println();
        }
    }
}
