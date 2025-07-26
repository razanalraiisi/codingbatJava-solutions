public String backAround(String str) {
    String result="";
    if(str.length()>=1){
        char frontBack = str.charAt(str.length() - 1);
        String mid = str;
        result=  frontBack + mid + frontBack;
    }
    return result;
}