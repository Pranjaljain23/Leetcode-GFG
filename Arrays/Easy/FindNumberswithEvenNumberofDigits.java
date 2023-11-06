// 1295. Find Numbers with Even Number of Digits

class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitCount= 0;

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;

            while(num > 0) {
                num /= 10;
                count++;
            }
            if(count % 2 == 0) {
                evenDigitCount++;
            }
        }

        return evenDigitCount;
    }
}