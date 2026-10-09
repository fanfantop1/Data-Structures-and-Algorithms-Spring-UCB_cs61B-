public class AList {
    private int[] item;
    int size;

    public AList() {
        item = new int[999];
        size = 0;
    }

    public int intSize() {
        return size;
    }
    public void addlast(int x) {
        item[size] = x;
        size += 1;
    }
    public int getIndex(int x) {
        return item[x];
    }

    public static void main() {
        AList N = new AList();
        N.addlast(9);
        N.addlast(65);
        N.addlast(565);
        N.getIndex(2);
        IO.println(N.getIndex(0));
    }
}
