public int wordsCount(String[] words, int len) {
    int count=0;
    for(int i=0; i<words.length; i++){
        if(words[i].length()==len){
            count=count+1;
        }
    }
    return count;
}
