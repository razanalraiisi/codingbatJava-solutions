public int countClumps(int[] nums) {
    int clumps = 0;
    int i = 0;

    while (i < nums.length) {
        int count = 1;
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            count++;
            i++;
        }
        if (count > 1) {
            clumps++;
        }
        i++;
    }

    return clumps;
}
