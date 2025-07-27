public String nTwice(String str, int n) {
    if(n<1){return "";}
    return str.substring(0,n)+str.substring(str.length()-n);
}