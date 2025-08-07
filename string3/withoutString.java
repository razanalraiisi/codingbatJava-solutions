public String withoutString(String base, String remove) {
    String lowerBase = base.toLowerCase();
    String lowerRemove = remove.toLowerCase();
    StringBuilder result = new StringBuilder();

    int i = 0;
    while (i < base.length()) {
        if (i <= base.length() - remove.length() &&
                lowerBase.substring(i, i + remove.length()).equals(lowerRemove)) {
            i += remove.length();
        } else {
            result.append(base.charAt(i));
            i++;
        }
    }

    return result.toString();
}
