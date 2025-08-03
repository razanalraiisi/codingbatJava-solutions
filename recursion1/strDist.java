public int strDist(String str, String sub) {
    if (str.length() < sub.length()) {
        return 0;
    } else if (str.startsWith(sub) && str.endsWith(sub)) {
        return str.length();
    } else if (!str.startsWith(sub)) {
        return strDist(str.substring(1), sub);
    } else {
        return strDist(str.substring(0, str.length() - 1), sub);
    }
}
