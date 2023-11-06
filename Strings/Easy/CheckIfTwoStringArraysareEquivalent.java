// 1662. Check If Two String Arrays are Equivalent

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder("");
        StringBuilder str2 = new StringBuilder("");

        for(int i = 0; i < word1.length; i++){
            str1.append(word1[i]);
        }
        str1.toString();
        for(int i = 0; i < word2.length; i++){
            str2.append(word2[i]);
        }

        // for(String s1 : word1) {
        //     str1.append(s1);
        // }
        // for(String s2 : word2) {
        //     str2.append(s2);
        // }

        return str1.toString().equals(str2.toString());
    }
}