class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long sum = 0;
        long min = 0;
        long max = 0;

        for (int difference : differences) {
            sum += difference;
            min = Math.min(min, sum);
            max = Math.max(max, sum);
        }

        long left = lower - min;
        long right = upper - max;

        return right < left ? 0 : (int) (right - left + 1); 
    }
}