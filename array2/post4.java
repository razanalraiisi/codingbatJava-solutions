public int[] post4(int[] nums) {
    int index = nums.length - 1;
    while (nums[index] != 4) {
        index--;
    }
    int length = nums.length - index - 1;
    int[] result = new int[length];
    for (int i = 0; i < length; i++) {
        result[i] = nums[index + 1 + i];
    }
    return result;
}
