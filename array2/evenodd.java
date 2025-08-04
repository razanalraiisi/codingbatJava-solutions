public int[] evenOdd(int[] nums) {
    int[] result = new int[nums.length];
    int evenIndex = 0;
    int oddIndex = nums.length - 1;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 2 == 0) {
            result[evenIndex] = nums[i];
            evenIndex++;
        } else {
            result[oddIndex] = nums[i];
            oddIndex--;
        }
    }

    return result;
}
