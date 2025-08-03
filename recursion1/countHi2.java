public int countHi2(String str) {
    if (str.length() < 2) {
        return 0;
    }
    if (str.startsWith("hi")) {
        return 1 + countHi2(str.substring(2));
    }
    if (str.length() >= 3 && str.substring(1, 3).equals("hi") && str.charAt(0) == 'x') {
        return countHi2(str.substring(3));
    }
    return countHi2(str.substring(1));
}
