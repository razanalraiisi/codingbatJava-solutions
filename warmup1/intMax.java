public int intMax(int a, int b, int c) {
    int max=0;
    if(a>b && a>c){
        return max=a;
    }else if(b>a && b>c){
        return max=b;
    }else if(c>a && c>b){
        return max=c;
    }
    return max;
}
