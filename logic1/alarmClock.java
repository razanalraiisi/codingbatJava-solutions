public String alarmClock(int day, boolean vacation) {
    if((day>0 && day<=5) && !vacation){
        return "7:00";
    }else if((day>0 && day<=5) && vacation){
        return "10:00";
    }else if(!(day>0 && day<=5) && vacation){
        return "off";
    }
    else{
        return "10:00";
    }
}
