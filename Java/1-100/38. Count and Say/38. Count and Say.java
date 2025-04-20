class Solution {
    public String countAndSay(int n) {
        return RLE("", n, 0);
    }

    public String RLE(String str, int n, int k) {
        if (k == n) return str;
        if (str.length() == 0) {
            return RLE("1", n, 1);
        }

        StringBuilder newNum = new StringBuilder();
        int count = 1;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (i + 1 < length && c == str.charAt(i + 1)) {
                count++;
            } else {
                newNum.append(count).append(c);
                count = 1;
            }
        }

        return RLE(newNum.toString(), n, k + 1);
    }
}