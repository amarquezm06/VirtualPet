public class DebugErrors {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("La suma es: " + sumArray(numbers));
        String text = "";
        System.out.println("La longitud del texto es: " + text.length());
        int result = divideNumbers(10, 2);
        System.out.println("El resultado de la división es: " + result);
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int divideNumbers(int a, int b) {
        return a / b;
    }
}

