public boolean groupSum5(int start, int[] nums, int target) {
    if (start >= nums.length) {
        return target == 0;
    }
    if (nums[start] % 5 == 0) {
        int nextIndex = start + 1;
        if (nextIndex < nums.length && nums[nextIndex] == 1) {
            nextIndex++;
        }
        return groupSum5(nextIndex, nums, target - nums[start]);
    } else {
        if (groupSum5(start + 1, nums, target - nums[start])) {
            return true;
        } else {
            return groupSum5(start + 1, nums, target);
        }
    }
}
