public int blackjack(int a, int b) {
    if (a > 21 && b > 21) {
        return 0;
    }

    if (a > 21) {
        return b;
    }
    if (b > 21) {
        return a;
    }


    if (Math.abs(21 - a) < Math.abs(21 - b)) {
        return a;
    } else if (Math.abs(21 - b) < Math.abs(21 - a)) {
        return b;
    } else {
        return a;
    }
}
