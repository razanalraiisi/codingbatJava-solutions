public boolean old35(int n) {
    int m3=n%3;
    int m5=n%5;
    if(m3 == 0 && m5 != 0){
        return true;
    }else if(m5 == 0 && m3 != 0){
        return true;
    }else{
        return false;
    }
}
