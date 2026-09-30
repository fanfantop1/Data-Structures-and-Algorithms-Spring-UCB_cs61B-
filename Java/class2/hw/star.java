/**
 * Prints a right-aligned triangle of stars ('*') with N lines.
 * The first row contains 1 star, the second 2 stars, and so on.
 */
public static void starTriangle(int N) {
    for (int i = 1; i <= N; i++) {
        // 打印前面的空格，使星号右对齐
        for (int j = 1; j <= N - i; j++) {
            IO.print(" ");
        }
        // 打印当前行的星号
        for (int j = 1; j <= i; j++) {
            IO.print("*");
        }
        // 换行
        IO.println(" ");
    }

}

public static void main(String[] args) {
    // 测试 starTriangle 函数
    starTriangle(5);
}