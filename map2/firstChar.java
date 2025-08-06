public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap<>();
    for (int i = 0; i < strings.length; i++) {
        String key = strings[i].substring(0, 1);
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + strings[i]);
        } else {
            map.put(key, strings[i]);
        }
    }
    return map;
}
