public class intlist {
    int first;
    intlist rest;
    public intlist(int first, intlist rest) {
        this.first = first;
        this.rest = rest;
    }

    public static int sizefor(intlist L) {
        int a = 0;
        for (intlist p = L; p != null; p = p.rest) {
            a++;
        }
        return a; 
    }

    public static int size(intlist L) {
        if (L == null) {
            return 0;
        } else {

            return 1 + size(L.rest);
        }
    }

    public static int get(intlist L,int i ) {
        if (i == 0) {
            return L.first;
        } else {
            return get(L.rest, i - 1);
        }

    }
  
    public int getcurrent(intlist L,int i) {
        intlist current = this;
        while (i != 0) {
            current = current.rest;
            i-=1;
        }
        return current.first;
    }

    public intlist listadd(intlist L) {
        intlist newrest = rest.listadd();
        return new intlist(first + 1, newrest);
        
        
    }
    public static void main() {
        intlist L = new intlist(5, null);
        L.first = 5;

        L.rest = new intlist(10, null);

        L.rest.rest = new intlist(15, null);
        L.rest.rest.rest = new intlist(20, null);

        intlist L1 = new intlist(1, new intlist(2, new intlist(3, null)));
        intlist L3 = new intlist(3,null);
        IO.println(L1.first);
        L3 = new intlist(2,L3);
        L3 = new intlist(1,L3);

        }

    
}
