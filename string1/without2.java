public String without2(String str) {
    if(str.length() < 2){
        return str;
    }
    String first2 = str.substring(0, 2);
    String last2 = str.substring(str.length() - 2);
    String result = "";

    if(first2.equals(last2)){
        result = str.substring(2);
    } else {
        result = str;
    }
    return result;
}
