public List wordsWithoutList(String[] words, int len) {
    ArrayList<String> nl = new ArrayList<String>();
    for(int i=0; i<words.length; i++){
        if(words[i].length()!=len){
            nl.add(words[i]);
        }

    }
    return nl;
}
