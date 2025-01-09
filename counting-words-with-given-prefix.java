class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (checkPrefix(words[i], pref)) {
                count++;
            }
        }
        return count;
    }

    public boolean checkPrefix(String word, String prefix) {
        int len1 = word.length();
        int len2 = prefix.length();
        if (len2 > len1) {
            return false;
        }
        for (int i = 0; i < len2; i++) {
            if (word.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
