public String delDel(String str) {
    if(str.length()>=4 && str.substring(1,4).equals("del")){
        String first = str.substring(0,1);
        String rem = str.substring(4);
        return first + rem;
    }
    return str;
}
