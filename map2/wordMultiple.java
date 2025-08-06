public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Integer> countMap = new HashMap<>();
    Map<String, Boolean> resultMap = new HashMap<>();

    for (int i = 0; i < strings.length; i++) {
        String word = strings[i];
        if (!countMap.containsKey(word)) {
            countMap.put(word, 1);
            resultMap.put(word, false);
        } else {
            countMap.put(word, countMap.get(word) + 1);
            resultMap.put(word, true);
        }
    }

    return resultMap;
}
