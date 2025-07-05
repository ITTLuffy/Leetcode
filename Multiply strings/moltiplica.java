public class moltiplica {
        public String multiply(String num1, String num2) {
        // If either number is "0", the product is "0"
        if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length(), n = num2.length();
        int[] result = new int[m + n];

        // Multiply digits from right to left
        for (int i = m - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int mul = digit1 * digit2;
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;          // current digit
                result[i + j] += sum / 10;             // carry to the left
            }
        }

        // Build the result string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            // Skip leading zeros
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }

}
