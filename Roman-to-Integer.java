class Solution {
    int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int total = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (i < length - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                total = total - map.get(s.charAt(i));
            } else {
                total = total + map.get(s.charAt(i));
            }
        }
        return total;
    }
}
