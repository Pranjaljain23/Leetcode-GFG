// 441. Arranging Coins

class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        int row = 0;

        while(n > 0) {
            n -= i;
            if(n >= 0) row++;
            i++;
        }

        return row;
    }
}