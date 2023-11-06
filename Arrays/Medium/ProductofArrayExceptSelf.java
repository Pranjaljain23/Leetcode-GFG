// 238. Product of Array Except Self

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] arr = new int[n];

        arr[0] = 1;
        for(int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] * nums[i - 1];
        }

        int suffixFactor = 1;
        for(int i = n - 1; i >= 0; i--) {
            arr[i] *= suffixFactor;
            suffixFactor *= nums[i]; 
        }

        return arr;

        //Upper solution is better because it doesn't use extra space 
        //Note:- Given that resulting array is not considered as extra space
        // int n = nums.length;
        
        // int[] prefix = new int[n];
        // int[] suffix = new int[n];

        // prefix[0] = 1;
        // suffix[n - 1] = 1;

        // for(int i = 1; i < n; i++) {
        //     prefix[i] = prefix[i - 1] * nums[i - 1];
        //     suffix[n - 1 - i] = suffix[n - i] * nums[n - i];
        // }

        // for(int i = 0; i < n; i++) {
        //     nums[i] = prefix[i] * suffix[i];
        // }
        // return nums;
    }
}