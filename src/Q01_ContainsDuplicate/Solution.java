package Q01_ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {

        int[] nums = {2, 3, 6, 7, 9, 11, 2};

        Solution s = new Solution();
        boolean result = s.containsDuplicate(nums);
        System.out.println("Sonuc : " + result);
    }

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

}

