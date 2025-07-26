public String front22(String str) {
    String result="";
    if(str.length()<=2){
        return str+str+str;
    }else{
        String first2= str.substring(0,2);
        result= first2+str+first2;
    }
    return result;

}
