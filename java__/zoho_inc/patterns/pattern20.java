/*
     1 
   1 1 
  1 2 1 
 1 2 2 1 
1 2 3 2 1 
 1 2 2 1 
  1 2 1 
   1 1 
    1 
 */
public class pattern20 {
    public static void main(String[] args) {
        int n= 5;
        int val=1;
        for(int i=1; i<(2*n); i++){
            int colLimit = Math.min(i, (2*n-i));
            for(int j=0; j<(n-colLimit); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=colLimit; j++){
                if(i<n)
                    val = Math.min(j, (i-j+1));
                else{
                    val = Math.min(j, ((2*n-i)-j+1));
                }
                System.out.print((val)+" ");
            }   
    
            System.out.println();
        }
    }
}
