public String front3(String str) {
    String result= "";
    if(str.length()<=3){
        for(int i=0 ; i<3; i++){
            result= result + str;
        }
        return result;
    }else{
        String newStr= str.substring(0,3);
        for(int i=0; i<3; i++){
            result= result + newStr;
        }
        return result;
    }
}