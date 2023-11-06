// 1528. Shuffle String

class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        StringBuilder str = new StringBuilder("");
        char[] arr = new char[n];

        for(int i = 0;  i < n; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        str.append(arr);

        return str.toString();
    }
}