int langer(int x,int y) {
    if (x > y) {
        return x;
    } else {
        return y;
    }
}

void main() {
    int a = 51;
    int b = 101;
    int c = langer(a, b);
    IO.println(c);
}