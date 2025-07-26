public int close10(int a, int b) {
    int result=0;
    int A=Math.abs(10-a);
    int B=Math.abs(10-b);
    if(A<B){
        result=a;
    }else if(B<A){
        result=b;
    }else{
        result=0;
    }
    return result;
}
