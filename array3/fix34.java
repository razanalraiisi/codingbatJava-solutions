public int[] fix34(int[] nums) {
    int fourIndex = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            while (nums[fourIndex] != 4) {
                fourIndex++;
            }
            int temp = nums[i + 1];
            nums[i + 1] = nums[fourIndex];
            nums[fourIndex] = temp;
            fourIndex++;
        }
    }

    return nums;
}
