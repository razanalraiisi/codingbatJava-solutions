public boolean specialEleven(int n) {
    int multiple=n%11;
    if(multiple==0 || multiple==1){
        return true;
    }
    return false;
}
