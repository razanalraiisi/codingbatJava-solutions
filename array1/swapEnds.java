public int[] swapEnds(int[] nums) {
    int v1= nums[0];
    nums[0]=nums[nums.length-1];
    nums[nums.length-1]=v1;
    return nums;
}
