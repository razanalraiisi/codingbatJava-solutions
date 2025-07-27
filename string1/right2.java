public String right2(String str) {
    if(str.length()<2){
        return str;
    }
    String last=str.substring(str.length()-2);
    String first=str.substring(0,str.length()-2);
    return last+first;
}