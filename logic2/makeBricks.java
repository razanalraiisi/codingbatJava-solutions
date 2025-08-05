public boolean makeBricks(int small, int big, int goal) {
    int maxBigBricks = goal / 5;

    if (maxBigBricks > big) {
        maxBigBricks = big;
    }

    int remainingGoal = goal - (maxBigBricks * 5);

    if (small >= remainingGoal) {
        return true;
    } else {
        return false;
    }
}
