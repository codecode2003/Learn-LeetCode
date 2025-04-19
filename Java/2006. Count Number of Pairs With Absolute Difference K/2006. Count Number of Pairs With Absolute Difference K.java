class Solution {
    public int countKDifference(int[] nums, int k) {
        // low O(n^2)
        // int n = nums.length;
        // int ans = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (nums[i] - nums[j] == k || nums[j] - nums[i] == k) ans++;
        //     }
        // }
        // return ans;

        // hight O(n)
        int n = nums.length;
        int[] freq = new int[101];
        int ans = 0;
        
        for (int num : nums) {
            if (num - k >= 1) ans += freq[num - k];
            if (num + k <= 100) ans += freq[num + k];
            freq[num]++;
        }

        return ans;
    }
}