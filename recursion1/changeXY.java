public String changeXY(String str) {
    if (str.length() == 0) {
        return "";
    } else {
        char first = str.charAt(0);
        if (first == 'x') {
            return 'y' + changeXY(str.substring(1));
        } else {
            return first + changeXY(str.substring(1));
        }
    }
}
