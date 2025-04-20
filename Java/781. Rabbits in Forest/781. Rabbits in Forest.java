class Solution {
    public int numRabbits(int[] answers) {
        // low O(n) n = 1001
        // int[] freq = new int[1001];
        // for (int answer : answers) {
        //     freq[answer]++;
        // }

        // int ans = 0;
        // for (int i = 1; i <= 1000; i++) {
        //     if (freq[i] > 0) {
        //         int groupSize = i + 1;
        //         int numGroups = (freq[i] + i) / (i + 1);
        //         ans += numGroups * groupSize;
        //     }
        // }

        // return ans + freq[0];

        // O(n) max(n) = answers.length;
        int n = answers.length;
        int[] count = new int[1000];
        
        int ans = 0;
        for( int x : answers) {
            if (++count[x] == 1)
                ans += x + 1;
            if (count[x] == x + 1)
                count[x] = 0;
        }
        
        return ans;
    }
}
