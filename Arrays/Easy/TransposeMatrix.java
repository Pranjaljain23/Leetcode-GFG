// 867. Transpose Matrix

class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] mat = new int[matrix[0].length][matrix.length];
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                mat[i][j] = matrix[j][i];
            }
        }

        return mat;
    }
}