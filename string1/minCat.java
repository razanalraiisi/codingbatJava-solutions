public String minCat(String a, String b) {
    String result="";
    int diff=0;
    if(a.length()>b.length()){
        diff= a.length()-b.length();
        result = a.substring(diff) + b;
    }else if(a.length()<b.length()){
        diff= b.length()-a.length();
        result = a + b.substring(diff);
    }else{
        result=a+b;
    }
    return result;
}
