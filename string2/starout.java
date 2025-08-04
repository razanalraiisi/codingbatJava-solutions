public String starOut(String str) {
    String result = "";
    int len = str.length();
    for (int i = 0; i < len; i++) {
        if (str.charAt(i) != '*' &&
                (i == 0 || str.charAt(i - 1) != '*') &&
                (i == len - 1 || str.charAt(i + 1) != '*')) {
            result += str.charAt(i);
        }
    }
    return result;
}
