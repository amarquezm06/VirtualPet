public class ModularExample {
    public static void main(String[] args) {
        int n1 = 5, n2 = 6, res;
        res = sum(n1, n2);
        System.out.println("The sum of " + n1 + " and " + n2 + " is " + res);
    }

    private static int sum(int a, int b) {
        int resultat;
        resultat = a + b;
        return resultat;
    }
}

