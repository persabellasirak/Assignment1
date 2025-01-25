import java.math.BigInteger;

public class Problem3 {
    public static class NotFibonacci {
        public static void main(String[] args) {
            int n = 10; // Number of terms
            BigInteger[] sequence = generateNotFibonacci(n);
            System.out.println("Input: " + n);
            System.out.print("Output: ");
            for (BigInteger num : sequence) {
                System.out.print(num + " ");
            }
        }

        public static BigInteger[] generateNotFibonacci(int n) {
            BigInteger[] sequence = new BigInteger[n];
            sequence[0] = BigInteger.ZERO;
            sequence[1] = BigInteger.ONE;
            for (int i = 2; i < n; i++) {
                sequence[i] = sequence[i - 1].multiply(BigInteger.valueOf(3))
                        .add(sequence[i - 2].multiply(BigInteger.valueOf(2)));
            }
            return sequence;
        }
    }

}
