public int[] copyEvens(int[] nums, int count) {
    int[] newCount = new int[count];
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
        if (j < count && nums[i] % 2 == 0) {
            newCount[j] = nums[i];
            j++;
        }
    }
    return newCount;
}
