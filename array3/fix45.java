public int[] fix45(int[] nums) {
    int fiveIndex = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 4) {
            if (nums[i + 1] != 5) {
                while (nums[fiveIndex] != 5 || (fiveIndex > 0 && nums[fiveIndex - 1] == 4)) {
                    fiveIndex++;
                }
                int temp = nums[i + 1];
                nums[i + 1] = nums[fiveIndex];
                nums[fiveIndex] = temp;
                fiveIndex++;
            }
        }
    }

    return nums;
}
