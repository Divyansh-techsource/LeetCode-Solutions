class Solution {
    public int maxProduct(int[] nums) {
        int max = 0, sMax = 0;
        for (int num : nums) {
            if (max < num) {
                sMax = max;
                max = num;
            } else if (sMax < num) {
                sMax = num;
            }
        }
        return (max - 1) * (sMax - 1);
    }
}