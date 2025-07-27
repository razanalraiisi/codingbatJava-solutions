public String firstTwo(String str) {
    if(str.length()<=2){
        return str;
    }
    String first=str.substring(0,2);
    return first;
}