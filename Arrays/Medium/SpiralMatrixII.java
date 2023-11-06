// 59. Spiral Matrix II

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int sr = 0;
        int sc = 0;
        int er = n - 1;
        int ec = n - 1;

        int num = 1;

        while(sr <= er) {
            for(int i = sc; i <= ec; i++) {
                matrix[sr][i] = num++;
            }
            for(int i = sr + 1; i <= er; i++) {
                matrix[i][ec] = num++;
            }
            for(int i = ec - 1; i >= sc; i--) {
                matrix[er][i] = num++;
            }
            for(int i = er - 1; i >= sr + 1; i--) {
                matrix[i][sc] = num++;
            }

            sr++;
            sc++;
            er--;
            ec--;
        }

        return matrix;
    }
}