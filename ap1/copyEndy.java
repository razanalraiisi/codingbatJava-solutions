public int[] copyEndy(int[] nums, int count) {
    int[] newCount = new int[count];
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
        if (j < count && ((nums[i]>=0 && nums[i]<=10) || (nums[i]>=90 && nums[i]<=100))) {
            newCount[j] = nums[i];
            j++;
        }
    }
    return newCount;
}
