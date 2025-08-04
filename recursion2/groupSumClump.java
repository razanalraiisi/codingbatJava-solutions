public boolean groupSumClump(int start, int[] nums, int target) {
    if (start >= nums.length) {
        return target == 0;
    }
    int sum = nums[start];
    int count = 1;
    for (int i = start + 1; i < nums.length; i++) {
        if (nums[i] == nums[start]) {
            sum += nums[i];
            count++;
        } else {
            break;
        }
    }
    if (groupSumClump(start + count, nums, target - sum)) {
        return true;
    }
    if (groupSumClump(start + count, nums, target)) {
        return true;
    }
    return false;
}
