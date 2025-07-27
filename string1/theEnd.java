public String theEnd(String str, boolean front) {
    String result="";
    if(str.length()>=1 && front==true){
        return result= str.substring(0,1);
    }else if(str.length()>=1 && front==false){
        return result= str.substring(str.length()-1);
    }
    return result;
}