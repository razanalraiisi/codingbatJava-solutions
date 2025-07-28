public String startWord(String str, String word) {
    if(str.length() < word.length()){
        return "";
    }
    String result = "";

    if(str.substring(1, word.length()).equals(word.substring(1))){
        result = str.substring(0, word.length());
    }

    return result;
}