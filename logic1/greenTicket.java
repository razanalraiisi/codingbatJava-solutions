public int greenTicket(int a, int b, int c) {
    if(a==b && b!=c || b==c && c!=a || a==c && c!=b){
        return 10;
    }else if(a==b && b==c){
        return 20;
    }else{
        return 0;
    }
}
