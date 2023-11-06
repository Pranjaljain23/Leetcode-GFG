import java.util.*;


// 1431. Kids With the Greatest Number of Candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        //Search for max from the array
        for(int i = 0; i < candies.length; i++){
            max = Math.max(candies[i], max);
        }

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max) {
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

        return list;
    }
}