public class Solution {

    public void setZeroes(int[][] matrix) {

        //Brute Force approach
        
        // int n = matrix.length;
        // int m = matrix[0].length;
        
        // int r[] = new int[n];
        // int c[] = new int[m];
        
        // int rInd = 0;
        // int cInd = 0;
        
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(matrix[i][j] == 0){
                    
        //             boolean rowExists = false;
        //             for(int k = 0; k < rInd; k++) {
        //                 if(r[k] == i) rowExists = true;
        //             }
        //             if(!rowExists && rInd < n){
        //                 r[rInd] = i;
        //                 rInd++;
        //             }
        //             boolean colExists = false;
        //             for(int k = 0; k < cInd; k++) {
        //                 if(c[k] == j) colExists = true;
        //             }
        //             if(!colExists && cInd < m){
        //                 c[cInd] = j; 
        //                 cInd++;
        //             }
        //         }
        //     }
        // }
        
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         for(int k = 0; k < rInd; k++){
        //             if(r[k] == i){
        //                 matrix[i][j] = 0;
        //             }
        //         }
        //         for(int k = 0; k < cInd; k++){
        //             if(c[k] == j){
        //                 matrix[i][j] = 0;
        //             }
        //         }
        //     }
        // }

        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] r = new boolean[row];
        boolean [] c = new boolean[col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col ; j++){
                if(matrix[i][j] == 0){
                    r[i] = true;
                    c[j] = true;
                }
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(r[i] == true || c[j] == true){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
