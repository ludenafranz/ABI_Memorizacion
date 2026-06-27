package unl;

import java.util.HashMap;
import java.util.Map;

public class FuncionFibonacci {
    // Tabla Hash que almacena los resultados ya calculados
    static Map<Integer,Long> cache = new HashMap<>();

    /**
     * Calcula el número de Fibonacci de forma tradicional
     * recalcula los mismos valores varias veces.
     */
    public long fibonacci(int n) {
        // Caso base: Fibonacci de 0 es 0.
        if (n == 0) {
            return 0;
        }
        // Caso base: Fibonacci de 1 es 1.
        else if (n == 1) {
            return 1;
        }
        // Llamadas recursivas para calcular el resultado.
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Calcula el número de Fibonacci utilizando memoización.
     * Los resultados se almacenan en una tabla Hash para eviatr repetir operaciones
     */
    public long fibonacciOptimizado(int n) {
        // Caso base: Fibonacci de 0 es 0.
        if (n == 0) {
            return 0;
        }
        // Caso base: Fibonacci de 1 es 1.
        else if (n == 1) {
            return 1;
        }
        // Verifica si el resultado ya fue calculado.
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        // Calcula el resultado utilizando llamadas recursivas.
        long resultado = fibonacciOptimizado(n - 1) + fibonacciOptimizado(n - 2);
        // Guarda el resultado en la tabla Hash
        cache.put(n, resultado);
        // Devuelve el resultado obtenido.
        return resultado;
    }

}
