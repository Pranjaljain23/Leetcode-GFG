// 1389. Create Target Array in the Given Order

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {

            //Shifting require when i is greater than index[i]
            if(index[i] < i) {
                int j = i;

                //shifting element for reoccuring index
                while(index[i] < j) {
                    target[j] = target[j - 1];
                    j--;
                }
            }
            target[index[i]] = nums[i];
        }

        return target;
    }
}