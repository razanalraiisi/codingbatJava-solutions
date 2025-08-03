public int scoreUp(String[] key, String[] answers) {
    int result=0;
    for (int i = 0; i < key.length; i++) {
        if (answers[i].equals("?")) {
            continue;
        } else if (answers[i].equals(key[i])) {
            result += 4;
        } else {
            result -= 1;
        }
    }

    return result;
}


