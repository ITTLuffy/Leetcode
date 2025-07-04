
public class dividi {

    public int divide(int dividend, int divisor) {
        // Gestione overflow speciale
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Calcolo segno risultato
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Lavora con valori positivi long per evitare overflow
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int res = 0;
        while (dvd >= dvs) {
            long temp = dvs, multiple = 1;
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            res += multiple;
        }

        return negative ? -res : res;
    }

}
