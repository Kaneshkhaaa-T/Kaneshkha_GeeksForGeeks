// User function Template for Java

class Solution {
    
     static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static int palPartition(String s) {
        int n = s.length();

        int[] dp = new int[n + 1];

        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {

            int minPartitions = Integer.MAX_VALUE;

            for (int j = i; j < n; j++) {

                if (isPalindrome(s, i, j)) {
                    minPartitions = Math.min(
                        minPartitions,
                        1 + dp[j + 1]
                    );
                }
            }

            dp[i] = minPartitions;
        }

        return dp[0] - 1;
    
    }
}