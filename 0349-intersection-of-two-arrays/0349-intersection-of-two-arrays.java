 import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }

        HashSet<Integer> result = new HashSet<>();

        for (int i : nums2) {
            if (set.contains(i)) {
                result.add(i);
            }
        }

        int[] ans = new int[result.size()];

        int index = 0;
        for (int i : result) {
            ans[index++] = i;
        }

        return ans;
    }
}