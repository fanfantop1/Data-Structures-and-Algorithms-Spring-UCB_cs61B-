
public class Sort {
    static public void Sort(String[] input) {
        int smallest = findsmallest(input, 0);
        swap(input, 0, smallest);
        sort(input, 0);
    }

    private static void sort(String[] input, int start) {
        if (start >= input.length) {
            return;
        }
        int smallest = findsmallest(input, start);
        swap(input, start, smallest);
        sort(input, start + 1);
    }

    public static int findsmallest (String[] input,int start) {
        int smallest = start;
        for (int i = start; i < input.length; i++) {
           int compare = input[i].compareTo(input[smallest]);

           if (compare < 0) {
               smallest = i;
           }
        }
        return smallest;
    }

    
    public static void swap(String[] input, int i, int j) {
        String temp = input[i];
        input[i] = input[j];
        input[j] = temp;

    }

}

