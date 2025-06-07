import java.util.*;
public class gaussJordan {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        double[][] matrix = new double[n][n+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<n+1; j++){
                matrix[i][j] = obj.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            if(matrix[i][i]==0){
                swap(matrix, i);
            }
            // for(int l=0; l<n; l++){
            //     for(int k=0; k<n+1; k++){
            //         System.out.print(" "+matrix[l][k]+" ");
            //     }
            //     System.out.println(i);
            // }
            for(int j=0; j<n; j++){
                matrix[i][j]/=matrix[i][i];
            }
            for(int j=0; j<n; j++){
                if(i!=j){
                    double factor = matrix[j][i]/matrix[i][i];
                    for(int k=0; k<n+1; k++){
                        matrix[j][k] -= factor*matrix[i][k];
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int k=0; k<n+1; k++){
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println();
        }
    }
    static void swap(double[][] matrix, int row){
        int n = matrix.length;
        for(int i=row; i<n; i++){
            if(matrix[i][row]!=0){
                for(int j=0; j<n+1; j++){
                    double temp = matrix[row][j];
                    matrix[row][j] = matrix[i][j];
                    matrix[i][j] = temp;
                }
                break;
            }
        }
    }
}
