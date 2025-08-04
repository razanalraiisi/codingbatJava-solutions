public boolean split53(int[] nums) {
    return helper(nums, 0, 0, 0);
}

private boolean helper(int[] nums, int index, int sum5, int sum3) {
    if (index >= nums.length) {
        return sum5 == sum3;
    }
    int val = nums[index];
    if (val % 5 == 0) {
        return helper(nums, index + 1, sum5 + val, sum3);
    }
    if (val % 3 == 0) {
        return helper(nums, index + 1, sum5, sum3 + val);
    }
    if (helper(nums, index + 1, sum5 + val, sum3)) {
        return true;
    }
    if (helper(nums, index + 1, sum5, sum3 + val)) {
        return true;
    }
    return false;
}
