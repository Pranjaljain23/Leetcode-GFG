// 1351. Count Negative Numbers in a Sorted Matrix

class Solution {
    public int countNegatives(int[][] grid) {
        //OPTIMIZED
        int count= 0;

        int row = 0;
        int col = grid[0].length - 1;

        while(row < grid.length && col >= 0) {
            if(grid[row][col] < 0) {
                count += (grid.length - row);
                col--;
            }
            else{
                row++;
            }
        }

        return count;

        //BRUTE FORCE
        // int count = 0;

        // for(int i = 0; i < grid.length; i++) {
        //     for(int j = 0; j < grid[0].length; j++) {
        //         if(grid[i][j] < 0) {
        //             count++;
        //         }
        //     }
        // }

        // return count;
    }
}