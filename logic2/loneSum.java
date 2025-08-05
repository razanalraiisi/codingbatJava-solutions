public int loneSum(int a, int b, int c) {
    int sum=a+b+c;
    if(a==b && b==c){
        return 0;
    }
    else if(a==b && b!=c){
        return c;
    }else if(a==c && c!=b){
        return b;
    }else if(b==c && c!=a){
        return a;
    }
    else{
        return sum;
    }
}
