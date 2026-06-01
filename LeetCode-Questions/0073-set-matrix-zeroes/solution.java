public class Solution {

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int r[] = new int[n];
        int c[] = new int[m];
        
        int rInd = 0;
        int cInd = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    
                    // 1. Only add row i if it hasn't been recorded yet
                    boolean rowExists = false;
                    for(int k = 0; k < rInd; k++) {
                        if(r[k] == i) rowExists = true;
                    }
                    if(!rowExists && rInd < n){
                        r[rInd] = i;
                        rInd++;
                    }
                    
                    // 2. Only add column j if it hasn't been recorded yet
                    boolean colExists = false;
                    for(int k = 0; k < cInd; k++) {
                        if(c[k] == j) colExists = true;
                    }
                    if(!colExists && cInd < m){
                        c[cInd] = j; // Storing the column index 'j'
                        cInd++;
                    }
                }
            }
        }
        
        // Your exact logic to zero out the matrix rows and columns
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                for(int k = 0; k < rInd; k++){
                    if(r[k] == i){
                        matrix[i][j] = 0;
                    }
                }
                for(int k = 0; k < cInd; k++){
                    if(c[k] == j){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}
