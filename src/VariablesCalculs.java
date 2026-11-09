public class VariablesCalculs {
    public static void main(String[] args) {

        // 1. Crear variables
        int edat = 25;
        double salari = 1500.50;
        float altura = 1.75f;
        boolean esAdult = true;

        // 2. Realitzar càlculs
        double salariPerEdat = salari / edat;
        float sumaAlturaEdat = altura + edat;

        // 3. Conversions
        int alturaEntera = (int) altura;  // Conversió explícita de float a int
        double edatDouble = edat;  // Conversió implícita de int a double

        // 4. Mostrar els resultats
        System.out.println("Edat: " + edat);
        System.out.println("Salari per edat: " + salariPerEdat);
        System.out.println("Suma d'edat i altura: " + sumaAlturaEdat);
        System.out.println("Altura convertida a enter: " + alturaEntera);
        System.out.println("Edat convertida a double: " + edatDouble);
        System.out.println("És adult?: " + esAdult);
    }

}
