public String lastTwo(String str) {
    String first="";
    String last1="";
    String last2="";
    if(str.isEmpty() || str.length()<=1){
        return str;
    }
    first=str.substring(0,str.length()-2);
    last1=str.substring(str.length()-2,str.length()-1);
    last2=str.substring(str.length()-1);
    return first+last2+last1;
}
