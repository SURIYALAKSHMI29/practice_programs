import java.util.*;

/* 
3
    1 4 7 
    2 5 8
    3 6 9  
*/
public class pattern14{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=0; j<n; j++){
                System.out.print((i+(n*j))+" ");
            }
            System.out.println();
        }
    }
}