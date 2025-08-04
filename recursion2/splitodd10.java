public boolean splitOdd10(int[] nums) {
    return helper(nums, 0, 0, 0);
}

private boolean helper(int[] nums, int index, int sum1, int sum2) {
    if (index >= nums.length) {
        return (sum1 % 10 == 0 && sum2 % 2 == 1) || (sum2 % 10 == 0 && sum1 % 2 == 1);
    }
    if (helper(nums, index + 1, sum1 + nums[index], sum2)) {
        return true;
    }
    if (helper(nums, index + 1, sum1, sum2 + nums[index])) {
        return true;
    }
    return false;
}
