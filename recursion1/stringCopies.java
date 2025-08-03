public boolean strCopies(String str, String sub, int n) {
    if (n == 0) {
        return true;
    } else if (str.length() < sub.length()) {
        return false;
    } else if (str.startsWith(sub)) {
        return strCopies(str.substring(1), sub, n - 1);
    } else {
        return strCopies(str.substring(1), sub, n);
    }
}
