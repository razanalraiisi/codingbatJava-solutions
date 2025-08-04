public int[] zeroFront(int[] nums) {
    int[] result = new int[nums.length];
    int index = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            result[index] = 0;
            index++;
        }
    }

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            result[index] = nums[i];
            index++;
        }
    }

    return result;
}
