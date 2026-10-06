public class SLList {
    

    public class InNode {
    int item;
    InNode next;

    public InNode(int i, InNode n) {
        item = i;
        next = n;
    }
    
}

    public InNode sentinel;
    public int size;
/**creates an empty SLList */
    public SLList() {
        sentinel = new InNode(63, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new InNode(63, null);
        sentinel.next = new InNode(x, null);
        size = 1;
    }

    public int getfirst() {
        return sentinel.next.item;
    }  

    public void addfirst(int x) {
        sentinel.next = new InNode(x, sentinel.next);
        size += 1;
    }

    public void addlast(int x) {
        size += 1;
        InNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new InNode(x, null);
    }

    public int getlast() {
        InNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    public int size() {
        
        return size;
    }

    public static void main() {
        SLList L = new SLList(5);
        L.addfirst(10);
        L.addlast(20);
        IO.println(L.getfirst());
        IO.println(L.getlast());
        InNode n = L.new InNode(15, null);
        IO.println(n.item);
        
    }

}
