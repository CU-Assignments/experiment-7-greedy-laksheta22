public class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increase = nums[i - 1] - nums[i] + 1;
                nums[i] += increase;
                operations += increase;
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 1, 1};
        System.out.println(solution.minOperations(nums1)); 

        int[] nums2 = {1, 5, 2, 4, 1};
        System.out.println(solution.minOperations(nums2)); 

        int[] nums3 = {8};
        System.out.println(solution.minOperations(nums3)); 
    }
}
