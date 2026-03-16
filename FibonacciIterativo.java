
public class FibonacciIterativo {
    public static void main(String[] args) {
        int n = 10; // Número de términos a mostrar
        int a = 0, b = 1;

        System.out.println("Serie de Fibonacci (" + n + " términos):");

        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");

            // Calcular el siguiente número
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}
