package hw;

public class star {
    void main() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (j <= i) {
                    IO.print("*");
                }
            }
            IO.println();
        }

    }

    
}
