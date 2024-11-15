// TC:O(n^2)
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//        int n = nums.length;
//         int temp;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (nums[j] > nums[j + 1]) {
//                     temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                 }
//             }
//         }
//         return nums[n - k];
//     }
// }

//TC:O(nlogn), SC:O(1)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
