class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
       return nums[nums.length-1];
    }
    
}


// class Solution {
//     public int singleNumber(int[] nums) {
//         int ans=0; //since XOR with 0 returns same number 
//         for(int i=0; i<nums.length; i++){
//             ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
//         }
//         return ans;    
//     }
// }
