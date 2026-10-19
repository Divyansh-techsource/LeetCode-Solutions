class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num < target) {
                count1++;
            } else if (num == target) {
                count2++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = count1; i < count1 + count2; i++) {
            res.add(i);
        }
        return res;
    }
}