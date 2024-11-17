class Solution {
  public int compress(char[] chars) {
    int ans=0;
    int i=0;
    while(i<chars.length) {
      char currchar = chars[i]; 
      int count = 0;
      while (i < chars.length && chars[i] == currchar) {
        count++;
        i++;
      }
      chars[ans++] = currchar; //assign currchar to chars[ans] then post increasement of ans by 1
      if (count > 1) {
        for (char c : String.valueOf(count).toCharArray()) {
          chars[ans++] = c; 
        }
      }
    }
    return ans;
  }
}
