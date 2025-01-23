class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int length = 1;
                num++;
                while (set.contains(num)) {
                    length++;
                    num++;
                }
                result = Math.max(result, length);
            }
        }
        return result;
    }
}
