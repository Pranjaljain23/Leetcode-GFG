// 1512. Number of Good Pairs

class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int count = 0;

        // for(int i = 0; i < nums.length - 1; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        // }
        
        // return count;


        //OPTIMIZED SOLUTION:- By storing the frequency of the numbers and using permutation for getting the possible pairs

        //O(n)

        int[] frequency = new int[101];

        for(int num : nums) {
            frequency[num]++; 
        } 

        int count = 0;

        //Explanation:- There are 3 1's in the array so the pairs possible would be 3*(3 -1) but this also include duplicates so divide by 2 for non repeating pairs
        
        for(int i : frequency) {
            count += (i * (i - 1)) / 2; 
        }

        return count;
    }
}