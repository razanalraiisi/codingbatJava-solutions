public boolean startHi(String str) {
    String newStr="";
    if(str.length()<=2){
        if(str == "hi"){
            return true;
        }
    }else{
        newStr= str.substring(0,2);
        if(newStr.equals("hi")){
            return true;
        }
        return false;

    }
    return false;
}
