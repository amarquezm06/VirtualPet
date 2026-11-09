public class SwapExample {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("a = " + a + " y b = " + b);

        int[] result = swap(a, b);
        a = result[0];
        b = result[1];

        System.out.println("a = " + a + " y b = " + b);
    }

    private static int[] swap(int x, int y) {
        return new int[]{y, x};
    }
}