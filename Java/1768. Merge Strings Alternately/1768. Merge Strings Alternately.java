class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int i = 0;

        while (i < length1 && i < length2) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;
        }

        result.append(word1.substring(i));
        result.append(word2.substring(i));

        return result.toString();
    }
}