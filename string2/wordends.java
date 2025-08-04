public String wordEnds(String str, String word) {
    String result = "";
    int len = word.length();
    for (int i = 0; i <= str.length() - len; i++) {
        if (str.substring(i, i + len).equals(word)) {
            if (i > 0) {
                result += str.charAt(i - 1);
            }
            if (i + len < str.length()) {
                result += str.charAt(i + len);
            }
        }
    }
    return result;
}
