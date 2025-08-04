public String mixString(String a, String b) {
    String result = "";
    int i = 0;
    while (i < a.length() && i < b.length()) {
        result += a.charAt(i);
        result += b.charAt(i);
        i++;
    }
    if (i < a.length()) {
        result += a.substring(i);
    }
    if (i < b.length()) {
        result += b.substring(i);
    }
    return result;
}
