public String[] firstSwap(String[] strings) {
    Map<Character, Integer> seen = new HashMap<>();

    for (int i = 0; i < strings.length; i++) {
        char firstChar = strings[i].charAt(0);

        if (seen.containsKey(firstChar)) {
            int prevIndex = seen.get(firstChar);

            if (prevIndex != -1) {

                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;


                seen.put(firstChar, -1);
            }
        } else {

            seen.put(firstChar, i);
        }
    }

    return strings;
}
