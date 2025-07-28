public String conCat(String a, String b) {
    if(!a.isEmpty() && !b.isEmpty() && a.substring(a.length()-1).equals(b.substring(0,1))){
        return a+b.substring(1);
    }
    return a+b;
}