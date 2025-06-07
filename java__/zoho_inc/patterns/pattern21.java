import java.util.*;
/* 
n=5
(0,0)(1,1)(2,2)(3,3)(4,4)
(1,0)(2,1)(3,2)(4,3)(5,3)
(2,0)(3,1)(4,2)(5,2)(6,2)
(3,0)(4,1)(5,1)(6,1)(7,1)
(4,0)(5,0)(6,0)(7,0)(8,0)
*/
public class pattern21 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=0; i<n; i++){
            // int secondTerm = 0;
            // for(int j=0; j<n; j++){
            //     System.out.print("("+(i+j)+","+(secondTerm)+")");
            //     if(j<(n-i-1))
            //         secondTerm++;
            // }

            for(int j=0; j<n-i; j++){
                System.out.print("("+(i+j)+","+(j)+")");
            }
            for(int j=(n-i); j<n; j++){
                System.out.print("("+(i+j)+","+(n-i-1)+")");
            }
            System.out.println();
        }
    }    
}
