// 54. Spiral Matrix

import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int srow = 0;
        int scol = 0;

        int erow = matrix.length - 1;
        int ecol = matrix[0].length - 1;

        while(srow <= erow && scol <= ecol) {
            for(int i = scol; i <= ecol; i++) {
                list.add(matrix[srow][i]);
            }
            for(int i = srow + 1; i <= erow; i++) {
                list.add(matrix[i][ecol]);
            }
            for(int i = ecol - 1; i >= scol; i--) {
                if(srow == erow) {
                    break;
                }
                list.add(matrix[erow][i]);
            }
            for(int i = erow - 1; i >= srow + 1; i--) {
                if(scol == ecol) {
                    break;
                }
                list.add(matrix[i][scol]);
            }

            srow++;
            scol++;
            erow--;
            ecol--;
            
        }

        return list;
    }
}