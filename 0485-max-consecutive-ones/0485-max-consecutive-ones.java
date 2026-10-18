class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                if (max < count) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
}