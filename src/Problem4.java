import java.math.BigInteger;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();; // Example input
        int position = WhereInSequence.findPosition(BigInteger.valueOf(input));
        System.out.println("Input: " + input);
        System.out.println("Output: " + position);
    }
    public static class WhereInSequence {
        public static int findPosition(BigInteger input) {
            BigInteger[] sequence = new BigInteger[1000]; // Generate up to 1000 terms
            sequence[0] = BigInteger.ZERO;
            sequence[1] = BigInteger.ONE;

            int pos = -1; // Position to return

            for (int i = 2; i < sequence.length; i++) {
                sequence[i] = sequence[i - 1].multiply(BigInteger.valueOf(3))
                        .add(sequence[i - 2].multiply(BigInteger.valueOf(2)));

                // Check if we've reached or exceeded the input
                if (sequence[i].compareTo(input) >= 0) {
                    pos = (sequence[i].equals(input)) ? i + 1 : i; // 1-based index
                    break;
                }
            }

            return pos;
        }
    }
}
