// 1365. How Many Numbers Are Smaller Than the Current Number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int[] arr = new int[nums.length];

        // for(int i = 0; i < nums.length; i++) {
        //     int count = 0;
        //     for(int j = 0; j < nums.length; j++) {
        //         if(i != j && nums[i] > nums[j]) {
        //             count++;
        //         }
        //     }
        //     arr[i] = count;
        // }

        // return arr;

        //Optimized Approach

        int[] freq = new int[101];

        for(int num : nums) {
            freq[num]++;
        }

        for(int i = 1; i <= 100; i++) {
            freq[i] += freq[i -1];
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] == 0 ? 0 : freq[nums[i] - 1];
        }

        return nums;
    }
}