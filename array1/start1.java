public int start1(int[] a, int[] b) {
    if (a.length > 0 && b.length > 0 && a[0] == 1 && b[0] == 1) {
        return 2;
    } else if (a.length > 0 && a[0] == 1) {
        return 1;
    } else if (b.length > 0 && b[0] == 1) {
        return 1;
    } else {
        return 0;
    }
}
