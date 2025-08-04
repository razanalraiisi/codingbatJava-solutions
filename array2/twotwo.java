public boolean twoTwo(int[] nums) {
    if (nums.length == 0) return true;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 2) {
            if (i > 0 && nums[i - 1] == 2) {
                continue;
            } else if (i < nums.length - 1 && nums[i + 1] == 2) {
                continue;
            } else {
                return false;
            }
        }
    }
    return true;
}
