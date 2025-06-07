import java.util.*;

/* 
3
*       * 
  *   *
    *
  *   *
*       *
    
*/
public class pattern10{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=1; i<2*n; i++){
            for(int j=1; j<2*n; j++){
                if(i==j || i+j==(2*n))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}