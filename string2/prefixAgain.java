public boolean prefixAgain(String str, int n) {
    String prefix = str.substring(0, n);
    if (str.indexOf(prefix, 1) != -1) {
        return true;
    } else {
        return false;
    }
}
