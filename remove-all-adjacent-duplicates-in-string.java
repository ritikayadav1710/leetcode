class Solution {
    public String removeDuplicates(String s) {
         Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        char[] resultArray = new char[stack.size()];
        int index= 0;
        while (!stack.isEmpty()) {
            resultArray[index++] = stack.pop();
        }
        String result = "";
        for (int i = resultArray.length - 1; i >= 0; i--) {
            result += resultArray[i];
        }
        return result;
    }
}

//worst case
// class Solution {
//     public String removeDuplicates(String s){
//     StringBuilder sb = new StringBuilder();
//         int n = s.length();
//         for (int i = 0; i < n; i++) {
//             boolean repeated = false;
//             while (i + 1 < n
//                    && s.charAt(i) == s.charAt(i + 1)) {
//                 repeated = true;
//                 i++;
//             }
//             if (!repeated)
//                 sb.append(s.charAt(i));
//         }
//         if (n == sb.length())
//             return sb.toString();
//         return removeDuplicates(sb.toString());
//     }
// }
