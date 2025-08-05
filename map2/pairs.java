public Map<String, String> pairs(String[] strings) {
    Map<String, String> map = new HashMap<>();
    for (int i = 0; i < strings.length; i++) {
        String str = strings[i];
        String key = str.substring(0, 1);
        String value = str.substring(str.length() - 1);
        map.put(key, value);
    }
    return map;
}
