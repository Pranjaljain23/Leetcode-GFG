// 977. Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;

        while(left <= right) {
            if(nums[left] * nums[left] > nums[right] * nums[right]) {
                res[pos] = nums[left] * nums[left];
                left++;
            }
            else{
                res[pos] = nums[right] * nums[right];
                right--;
            }
            pos--;
        } 

        return res;

        //BRUTE FORCE
        // for(int i = 0; i < nums.length; i++) {
        //     nums[i] *= nums[i];
        // }

        // Arrays.sort(nums);

        // return nums;
    }
}