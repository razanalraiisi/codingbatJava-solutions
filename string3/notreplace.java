public String notReplace(String str) {
    StringBuilder result = new StringBuilder();
    int i = 0;
    while (i < str.length()) {
        if (i + 1 < str.length()
                && str.charAt(i) == 'i'
                && str.charAt(i + 1) == 's') {

            boolean beforeIsLetter = i > 0 && Character.isLetter(str.charAt(i - 1));
            boolean afterIsLetter = i + 2 < str.length() && Character.isLetter(str.charAt(i + 2));

            if (!beforeIsLetter && !afterIsLetter) {
                result.append("is not");
                i += 2;
                continue;
            }
        }
        result.append(str.charAt(i));
        i++;
    }
    return result.toString();
}
