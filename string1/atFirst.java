public String atFirst(String str) {
    if(str.length() >= 2){
        return str.substring(0, 2);
    } else if(str.length() == 1){
        return str.charAt(0) + "@";
    } else {
        return "@@";
    }
}