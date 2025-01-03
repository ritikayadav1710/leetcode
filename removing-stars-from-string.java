// class Solution {
//     public String removeStars(String s) {
//         StringBuilder c = new StringBuilder();
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '*') {
//                 c.deleteCharAt(c.length() - 1);
//             } else {
//                 c.append(s.charAt(i));
//             }
//         }
//         return c.toString();
//     }
// }

class Solution {
    public String removeStars(String l) {
        Stack<Character> s = new Stack<>();
        for (char c : l.toCharArray()) {
            if (c == '*') {
                s.pop();
            }
            else {
                s.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s) {
            sb.append(c);
        }
        return sb.toString();
    }
}
