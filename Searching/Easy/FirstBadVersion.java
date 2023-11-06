// 278. First Bad Version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int version = 0;
        int ans = -1;

        while(start <= end) {
            version = start + (end - start) / 2;

            if(isBadVersion(version)) {
                ans = version;
                end = version - 1;
            }
            else{
                start = version + 1;
            }
        }

        return start;
    }
}