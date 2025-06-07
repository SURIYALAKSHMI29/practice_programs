import java.util.*;

/* 
3
1 2 3
6 5 4
7 8 9    
*/
public class pattern11{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        boolean odd = true;
        for(int i=0; i<n; i++){
            if(odd){
                for(int j=1; j<=n; j++){
                    System.out.print(((i*n)+j)+" ");
                }
            }
            else{
                for(int j=n; j>0; j--)
                    System.out.print(((i*n)+j)+" ");
            }
            
            odd = !odd;
            System.out.println();
        }
    }
}