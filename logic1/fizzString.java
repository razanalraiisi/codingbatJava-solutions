public String fizzString(String str) {
    if(str.charAt(0)=='f' && str.endsWith("b")){
        return "FizzBuzz";
    }else if(str.charAt(0)=='f'){
        return "Fizz";
    }else if(str.endsWith("b")){
        return "Buzz";
    }else{
        return str;
    }
}
