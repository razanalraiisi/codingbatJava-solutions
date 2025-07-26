public int max1020(int a, int b) {
    int result = 0;

    if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
        if (a > b) {
            return result = a;
        } else {
            return result = b;
        }

    } else if ((a >= 10 && a <= 20) && !(b >= 10 && b <= 20)) {
        return result = a;

    } else if (!(a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
        return result = b;

    } else {
        return result = 0;
    }
}
