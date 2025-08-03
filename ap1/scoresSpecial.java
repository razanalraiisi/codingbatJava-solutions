public int scoresSpecial(int[] a, int[] b) {
    return maxSpecial(a) + maxSpecial(b);
}
public int maxSpecial(int[] nums) {
    int max = 0;
    for (int num : nums) {
        if (num % 10 == 0 && num > max) {
            max = num;
        }
    }
    return max;
}