public String missingChar(String str, int n) {
    String newStr = str.substring(0,n) + str.substring(n+1);
    return newStr;
}
