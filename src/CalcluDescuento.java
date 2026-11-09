public class CalcluDescuento {
    public static void main(String[] args) {
        int edad = 65;
        boolean esSocio = false;
        double descuento = 0.0;
// Punto A
        if (edad >= 65 || esSocio) {
            descuento = 0.20;
// Punto B
        } else if (edad < 18) {
            descuento = 0.15;
        } else {
            descuento = 0.05;
        }
// Punto C
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
    }
}
