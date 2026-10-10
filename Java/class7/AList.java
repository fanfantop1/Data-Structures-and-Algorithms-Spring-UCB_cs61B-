public class AList<T> {
    private T[] item;
    int size;

    public AList(int x) {
        item = (T[]) new Object[x];
        size = 0;
    }

    public int intSize() {
        return size;
    }

    // public void resized(int size) {
    //     int i = 0;
    //     int[] resized =new int[size+1];
    //         while(i == size) {
    //             resized[i] = item[i];
    //             i += 1;
    //         }
    //         item = resized;

    // }

    // public void addlast(int x) {
    //     if (size == item.length) {
    //         resized(size * 2);//Optimizer: use *
    //         }
        
    //     item[size] = x;
    //     size += 1;
    // }
    public T getIndex(int x) {
        return item[x];
    }

    public static void main() {
        AList<Integer> N = new AList<>(9);
        // N.addlast(9);
        // N.addlast(65);
        // N.addlast(565);
        N.getIndex(2);
        IO.println(N.getIndex(0));
    }
}
