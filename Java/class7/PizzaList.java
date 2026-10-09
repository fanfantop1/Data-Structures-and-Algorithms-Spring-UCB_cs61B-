
public class PizzaList<Pizza> {
    

    private class Node {
    Pizza item;
    Node next;

    public Node(Pizza i, Node n) {
        item = i;
        next = n;
        }
    
    }

    public Node sentinel;
    public int size;
/**creates an empty SLList */
    public PizzaList() {
        sentinel = new Node(null, null);
        size = 0;
    }

    public PizzaList(Pizza x) {
        sentinel = new Node(null, null);
        sentinel.next = new Node(x, null);
        size = 1;
    }

    public Pizza getfirst() {
        return sentinel.next.item;
    }  

    public void addfirst(Pizza x) {
        sentinel.next = new Node(x, sentinel.next);
        size += 1;
    }

    public void addlast(Pizza x) {
        size += 1;
        Node p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(x, null);
    }

    public Pizza getlast() {
        Node p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    public int size() {
        
        return size;
    }

    public static void main() {
        PizzaList<Integer> L = new PizzaList(5);
        L.addfirst(10);
        L.addlast(20);
        IO.println(L.getfirst());
        IO.println(L.getlast());
        
    }

}
