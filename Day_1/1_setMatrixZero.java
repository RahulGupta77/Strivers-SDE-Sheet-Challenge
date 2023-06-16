import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int n = matrix.length; 
        int m = matrix[0].length; 

        boolean[] row = new boolean[n]; 
        boolean[] col = new boolean[m]; 

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;  
                }
            }
        }

        for(int i=0; i<n; i++){
            if(row[i]==true){
                for(int j=0; j<m; j++){
                    matrix[i][j] = 0; 
                }
            }
        }

        for(int j=0; j<m; j++){
            if(col[j]==true){
                for(int i=0; i<n; i++){
                    matrix[i][j] = 0; 
                }
            }
        }

    }

}