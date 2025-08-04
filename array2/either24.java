public boolean either24(int[] nums) {
    int count22 = 0;
    int count44 = 0;

    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == 2 && nums[i + 1] == 2) {
            count22++;
        }
        if (nums[i] == 4 && nums[i + 1] == 4) {
            count44++;
        }
    }

    if (count22 > 0 && count44 == 0) {
        return true;
    } else if (count44 > 0 && count22 == 0) {
        return true;
    } else {
        return false;
    }
}
