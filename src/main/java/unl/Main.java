package unl;


public class Main {
    public static void main(String[] args) {
        FuncionFibonacci calcular = new FuncionFibonacci();

        int n = 45;

        long inicio1 = System.nanoTime();
        long r1 = calcular.fibonacci(n);
        long fin1 = System.nanoTime();

        long inicio2 = System.nanoTime();
        long r2 = calcular.fibonacciOptimizado(n);
        long fin2 = System.nanoTime();

        System.out.println("=== FIBONACCI TRADICIONAL ===");
        System.out.println("Resultado: " + r1);
        System.out.println("Tiempo: "
                + ((fin1 - inicio1) / 1000000.0)
                + " ms");

        System.out.println();

        System.out.println("=== FIBONACCI CON MEMOIZACION ===");
        System.out.println("Resultado: " + r2);
        System.out.println("Tiempo: "
                + ((fin2 - inicio2) / 1000000.0)
                + " ms");
    }
}