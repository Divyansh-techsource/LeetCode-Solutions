class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0], max = nums[0];
        boolean[] contains = new boolean[101];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
            contains[nums[i]] = true;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!contains[i]) {
                res.add(i);
            }
        }
        return res;
    }
}