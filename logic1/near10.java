public boolean nearTen(int num) {
    int m=num%10;
    if(m<=2 || m>=8){
        return true;
    }
    return false;
}
