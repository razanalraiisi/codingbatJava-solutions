public String[] wordsWithout(String[] words, String target) {
    int count = 0;
    for (int i = 0; i < words.length; i++) {
        if (!words[i].equals(target)) {
            count++;
        }
    }

    String[] result = new String[count];
    int index = 0;
    for (int i = 0; i < words.length; i++) {
        if (!words[i].equals(target)) {
            result[index] = words[i];
            index++;
        }
    }

    return result;
}
