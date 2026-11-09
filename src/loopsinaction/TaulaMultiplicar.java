package loopsinaction;

public class TaulaMultiplicar {
    public int numero;

    public TaulaMultiplicar(int numero) {
        this.numero = numero;
    }

    public void mostrarTaula() {
        System.out.println();
        System.out.println("Taula del " + numero);
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
