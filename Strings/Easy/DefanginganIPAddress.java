// 1108. Defanging an IP Address

class Solution {
    public String defangIPaddr(String address) {

        int n = address.length();
        StringBuilder str = new StringBuilder("");
        char ch;

        for(int i = 0; i < n; i++) {
            ch = address.charAt(i);
            if(ch != '.') {
                str.append(ch);
            }
            else {
                str.append("[.]");
            }
        }

        return str.toString();

        //Approach using built in function
        //return address.replace(".", "[.]");
    }
}