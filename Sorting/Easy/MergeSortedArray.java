// 88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] arr = new int[m + n];

        // int i = 0;
        // int j = 0;
        // int k = 0;

        // while(i < m && j < n) {
        //     if(nums1[i] < nums2[j]) {
        //         arr[k] = nums1[i];
        //         i++;
        //     }
        //     else {
        //         arr[k] = nums2[j];
        //         j++;
        //     }
        //     k++;
        // }

        // while(i < m) {
        //     arr[k] = nums1[i];
        //     i++;
        //     k++;
        // }

        // while(j < n) {
        //     arr[k] = nums2[j];
        //     j++;
        //     k++;
        // }

        // for(int a = 0; a < arr.length; a++) {
        //     nums1[a] = arr[a];
        // }
        

        // BETTER APPROACH :- BY DOING IT FROM THE END
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        //This will run only if there is any element in the nums2
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}