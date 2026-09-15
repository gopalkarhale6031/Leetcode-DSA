class Solution {
    public int maxPalindromes(String s, int k) {

        int n = s.length();

        // dp[i][j] = true if s[i...j] is a palindrome
        boolean[][] dp = new boolean[n][n];

        // Build palindrome table
        for (int i = n - 1; i >= 0; i--) {

            for (int j = i; j < n; j++) {

                if (s.charAt(i) == s.charAt(j) &&
                    (j - i <= 2 || dp[i + 1][j - 1])) {

                    dp[i][j] = true;
                }
            }
        }

        int count = 0;
        int start = 0;

        // Greedily select the earliest-ending palindrome
        for (int end = 0; end < n; end++) {

            for (int i = start; i <= end - k + 1; i++) {

                if (dp[i][end]) {

                    count++;

                    // Next palindrome must start after this one
                    start = end + 1;

                    break;
                }
            }
        }

        return count;
    }
}