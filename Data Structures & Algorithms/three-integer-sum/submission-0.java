class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int p2 = i + 1, p3 = length - 1;
            while (p2 < p3) {
                int sum = nums[i] + nums[p2] + nums[p3];
                if (sum == 0) {
                    results.add(Arrays.asList(nums[i], nums[p2], nums[p3]));
                    while (p2 < p3 && nums[p2] == nums[p2 + 1]) p2++;
                    while (p2 < p3 && nums[p3] == nums[p3 - 1]) p3--;
                    p2++; p3--;
                } else if (sum < 0) {
                    p2++;
                } else {
                    p3--;
                }
            }
        }
        return results;
    }
}