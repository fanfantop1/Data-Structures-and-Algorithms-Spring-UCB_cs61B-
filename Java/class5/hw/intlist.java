
package hw;

public class intlist {
    int first;
    intlist rest;
    public intlist(int first, intlist rest) {
        this.first = first;
        this.rest = rest;
    }

    
    public static intlist incrRecursiveDestructive(intlist L, int x) {
        if (L != null) {
            // TODO: Fill in this code
            L.first += x;
            L.rest = incrRecursiveDestructive(L.rest, x);
            return L;
        }
        return null;
    }


public static void main() {
    intlist L = new intlist(5, new intlist(10, new intlist(15, null)));
    L = incrRecursiveDestructive(L, 3);

}

}