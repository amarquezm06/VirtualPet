public class excepcion {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3};
        try {
            System.out.println(myNumbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: S'ha intentat accedir a una posició de l'array el qual es inexistent.");
        }
    }
}

