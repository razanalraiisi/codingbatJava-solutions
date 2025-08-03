public String[] mergeTwo(String[] a, String[] b, int n) {
    String[] result = new String[n];
    int i = 0;
    int j = 0;
    int k = 0;

    while (k < n) {
        String wordA = a[i];
        String wordB = b[j];
        int compare = wordA.compareTo(wordB);
        if (compare < 0) {
            result[k] = wordA;
            i++;
        } else if (compare > 0) {
            result[k] = wordB;
            j++;
        } else {
            result[k] = wordA;
            i++;
            j++;
        }
        k++;
    }
    return result;
}
