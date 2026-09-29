/**
 * Prints a right-aligned triangle of stars ('*') with N lines.
 * The first row contains 1 star, the second 2 stars, and so on.
 */




public static void starTriangle(int N) {
    for(int i = 1; i <= N ;i++) {
        for(int j = 1; j <= N - 1; j++) {
            IO.print(" ");
        }
        for(int z = 1; z <= N; z++) {
            IO.print("*");
        }
        IO.println(" ");
    }
  // TODO: Fill in this function
}

    

