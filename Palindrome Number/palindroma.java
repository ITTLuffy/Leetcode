public class palindroma {
    public static boolean isPalindrome(int x) {
        String numero = String.valueOf(x);
        int left = 0;
        int right = numero.length() - 1;

        while (left < right) {
            if (numero.charAt(left) != numero.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        int numero = 121; // esempio di numero palindromo
        boolean risultato = isPalindrome(numero);
        System.out.println("Il numero " + numero + " e palindromo? " + risultato);
    }

}
