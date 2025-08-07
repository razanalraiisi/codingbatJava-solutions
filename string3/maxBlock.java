public int maxBlock(String str) {
    if (str.isEmpty()) return 0;

    int maxBlock = 1;
    int currentBlock = 1;

    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == str.charAt(i - 1)) {
            currentBlock++;
            if (currentBlock > maxBlock) {
                maxBlock = currentBlock;
            }
        } else {
            currentBlock = 1;
        }
    }

    return maxBlock;
}
