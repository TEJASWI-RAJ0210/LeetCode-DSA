class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax =0, maxSum = nums[0];
        int totalSum = 0;
        int curMin = 0, minSum = nums[0];

        for (int num : nums){
            curMax = Math.max(num, curMax + num);
            maxSum = Math.max(curMax, maxSum);

            curMin = Math.min(num, curMin + num);
            minSum = Math.min(curMin, minSum);

            totalSum += num;
        }

        if(maxSum<0){
            return maxSum;
        }

        return Math.max(maxSum, totalSum-minSum);  
    }
}