public boolean xyBalance(String str) {
    int lastX = str.lastIndexOf('x');
    int lastY = str.lastIndexOf('y');
    if (lastX == -1) {
        return true;
    } else {
        if (lastY > lastX) {
            return true;
        } else {
            return false;
        }
    }
}
