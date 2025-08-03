public boolean array220(int[] nums, int index) {
    if (index >= nums.length - 1) {
        return false;
    } else if (nums[index + 1] == nums[index] * 10) {
        return true;
    } else {
        return array220(nums, index + 1);
    }
}
