import java.util.*;

/* 
  n=3
    * * *
    * *
    *
    *
    * *
    * * *
*/
public class pattern4{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=0; i<2*n; i++){
            if(i<n){
                for(int j=n; j>i; j--){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=0; j<=(i%n); j++){
                    System.out.print("* ");
                }
            }
            
            System.out.println();
        }
    }
}