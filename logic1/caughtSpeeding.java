public int caughtSpeeding(int speed, boolean isBirthday) {
    if(isBirthday){
        speed=speed-5;
    }
    if(speed<=60){
        return 0;
    }else if(speed>60 && speed<=80){
        return 1;
    }else{
        return 2;
    }
}