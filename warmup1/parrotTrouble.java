public boolean parrotTrouble(boolean talking, int hour) {
    if(hour>=0 && hour<=23){
        if(talking && (hour<7 || hour>20)){
            return true;
        }
        return false;
    }
    return false;
}