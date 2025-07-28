public String middleThree(String str) {
    if(str.length()<=3){
        return str;
    }
    int mid=str.length()/2;

    return str.substring(mid-1,mid+2);
}
