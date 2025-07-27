public String endUp(String str) {
    if(str.length()<=3){
        return str.toUpperCase();
    }
    String first= str.substring(0,str.length()-3);
    String last= str.substring(str.length()-3).toUpperCase();
    return first+last;
}
