//O(n) space
// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         List<Integer> result = new ArrayList<>();
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         for (int key : map.keySet()) {
//             if (map.get(key) == 2) {
//                 result.add(key);
//             }
//         }
//         return result;
//     }
// }

//bruteforce
// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> result = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] == nums[j] && !result.contains(nums[i])) {
//                     result.add(nums[i]);
//                     break;
//                 }
//             }
//         } 
//         return result;
//     }
// }

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> resultSet = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      // Get the index, the element corresponds to
      int index = Math.abs(nums[i]) - 1;

      // If the number is already negative, it means we are 
      // encountering it twice
      if (nums[index] < 0)
        resultSet.add(index + 1);

      // Flip the number at the index to negative
      nums[index] = nums[index] * -1;
    }

    return resultSet;
    }
}
