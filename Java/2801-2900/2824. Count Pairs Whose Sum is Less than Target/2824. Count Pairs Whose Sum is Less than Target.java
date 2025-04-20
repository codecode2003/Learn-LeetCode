class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int n = nums.size();
        int left = 0, right = n - 1;
        int ans = 0;
        while (left < right) {
            if (nums.get(left) + nums.get(right) >= target) right--;
            else ans += right - left++;
        }
        return ans;
    }
}