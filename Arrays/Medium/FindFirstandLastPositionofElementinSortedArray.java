// 34. Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;

        int first = findFirst(nums, target, si, ei);
        int last = findLast(nums, target, si, ei);

        return new int[] {first, last};
    }

    public int findFirst(int[] nums, int target, int si, int ei) {
        int first = -1;
        while(si <= ei) {
           int mid = si + (ei - si) / 2;

           if(nums[mid] == target) {   
                //when find the target value, for the first index we will again apply binary search on the left of the remaining array            
                first = mid;
                ei = mid - 1; 
            }
            else if(nums[mid] > target) {
                ei = mid - 1;
            }
            else {
                si = mid + 1;
            }
        }

        return first;
    }

    public int findLast(int[] nums, int target, int si, int ei) {
        int last = -1;
        while(si <= ei) {
           int mid = si + (ei - si) / 2;

           if(nums[mid] == target) {  
                //same will we done here as first              
                last = mid;
                si = mid + 1; 
            }
            else if(nums[mid] > target) {
                ei = mid - 1;
            }
            else {
                si = mid + 1;
            }
        }

        return last;
    }
}