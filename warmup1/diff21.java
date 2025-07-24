public int diff21(int n) {
    int diff=0;
    if(n<=21){
        diff= 21 - n;
    }else{
        diff= (21-n)*2;
    }
    return Math.abs(diff);
}