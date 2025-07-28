public String withoutX2(String str) {
    if (str.length() >= 2) {
        String result = "";
        if (!str.substring(0,1).equals("x")) {
            result += str.charAt(0);
        }
        if (!str.substring(1,2).equals("x")) {
            result += str.charAt(1);
        }
        result += str.substring(2);
        return result;
    } else if (str.length() == 1) {
        return str.equals("x") ? "" : str;
    } else {
        return str;
    }
}
