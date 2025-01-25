public class Problem1 {
    public static void main(String[] args) {
        char[] text1 = "abc".toCharArray();
        char[] text2 = "abc".toCharArray();
        int result = findLongestCommonSubsequence(text1, text2);
        System.out.println("Input: text1 = abc, text2 = abc");
        System.out.println("Output: " + result);
    }

    public static int findLongestCommonSubsequence(char[] text1, char[] text2) {
        int[][] dp = new int[text1.length + 1][text2.length + 1];
        for (int i = 1; i <= text1.length; i++) {
            for (int j = 1; j <= text2.length; j++) {
                if (text1[i - 1] == text2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length][text2.length];
    }
}
