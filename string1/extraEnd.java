public String extraEnd(String str) {
    String last="";
    if(str.length()>=2){
        last=str.substring(str.length()-2);

    }
    return last+last+last;
}