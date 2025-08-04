int index = str.indexOf("x");
    if (index == -1 || index + 1 >= str.length()) {
        return false;
        }
        return str.charAt(index + 1) == 'x';