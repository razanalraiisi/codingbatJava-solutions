public List<Integer> math1(List<Integer> nums) {
    nums.replaceAll(n -> n +1);
    nums.replaceAll(n -> n *10);
    return nums;
}
