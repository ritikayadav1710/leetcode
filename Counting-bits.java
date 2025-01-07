class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int num=i;
            while (num > 0) {
            if (num % 2 == 1) { 
                count++;
            }
            num /= 2; 
        }
        result[i]=count;
        }
        return result;
    }
}


// class Solution {
//     public int[] countBits(int n) {
//         int[] result = new int[n + 1];
        
//         for (int i = 1; i <= n; i++) {
//             result[i] = result[i / 2] + (i % 2);
//         }
        
//         return result;
//     }
// }
