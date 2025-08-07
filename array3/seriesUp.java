public int[] seriesUp(int n) {
    int length = n * (n + 1) / 2;
    int[] result = new int[length];
    int index = 0;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            result[index++] = j;
        }
    }

    return result;
}
