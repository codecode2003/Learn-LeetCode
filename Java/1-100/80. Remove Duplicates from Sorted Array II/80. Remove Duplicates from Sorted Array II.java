class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 0;
        int k = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i-1] == nums[i]) {
                count++;
                if (count < 2) {
                    nums[k++] = nums[i];
                }
            } else {
                nums[k++] = nums[i];
                count = 0;
            }
        }
        return k;
    }
}