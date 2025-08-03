public int commonTwo(String[] a, String[] b) {
    int i = 0;
    int j = 0;
    int count = 0;
    String lastAdded = "";

    while (i < a.length && j < b.length) {
        int compare = a[i].compareTo(b[j]);
        if (compare == 0) {
            if (!a[i].equals(lastAdded)) {
                count++;
                lastAdded = a[i];
            }
            String match = a[i];
            while (i < a.length && a[i].equals(match)) i++;
            while (j < b.length && b[j].equals(match)) j++;
        } else if (compare < 0) {
            i++;
        } else {
            j++;
        }
    }
    return count;
}
