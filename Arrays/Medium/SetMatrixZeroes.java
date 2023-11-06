// 73. Set Matrix Zeroes

class Solution {
    public void setZeroes(int[][] matrix) {

        //BRUTE FORCE
        // int m = matrix.length;
        // int n = matrix[0].length;

        // int[][] matrix2 = new int[m][n];

        // for(int i = 0; i < m; i++) {
        //     for(int j = 0; j < n; j++) {
        //         matrix2[i][j] = matrix[i][j];
        //     }
        // }

        // for(int i = 0; i < m; i++) {
        //     for(int j = 0; j < n; j++) {
        //         if(matrix[i][j] == 0) {
        //             for(int k = 0; k < m; k++) {
        //                 matrix2[k][j] = 0;
        //             }
        //             for(int k = 0; k < n; k++) {
        //                 matrix2[i][k] = 0;
        //             }
        //         }
        //     }
        // }

        // for(int i = 0; i < m; i++) {
        //     for(int j = 0; j < n; j++) {
        //         matrix[i][j] = matrix2[i][j];
        //     }
        // }


        //BETTER THAN BRUTE FORCE
        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}


//There is one optimal approach to on striver channel check it for revision