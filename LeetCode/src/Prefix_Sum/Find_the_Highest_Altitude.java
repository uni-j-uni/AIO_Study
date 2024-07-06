package Prefix_Sum;

public class Find_the_Highest_Altitude {
}

class Solution {
    public int largestAltitude(int[] gain) {
        int newAltitude = 0, maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            newAltitude += gain[i];
            maxAltitude = Math.max(newAltitude, maxAltitude);
        }
        return maxAltitude;
    }
}