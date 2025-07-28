public String lastChars(String a, String b) {
    String result = "";

    if (a.isEmpty() && b.isEmpty()) {
        return result = "@@";
    } else if (a.isEmpty()) {
        return result = "@" + b.charAt(b.length() - 1);
    } else if (b.isEmpty()) {
        return result = a.charAt(0) + "@";
    } else {
        return result = a.charAt(0) + "" + b.charAt(b.length() - 1);
    }
}
