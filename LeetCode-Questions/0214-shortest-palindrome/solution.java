class Solution {
    public String shortestPalindrome(String s) {
         String rev = new StringBuilder(s).reverse().toString();

        // Combine string with a separator
        String combined = s + "#" + rev;

        // Build LPS array
        int[] lps = new int[combined.length()];
        for (int i = 1; i < combined.length(); i++) {
            int len = lps[i - 1];
            while (len > 0 && combined.charAt(i) != combined.charAt(len)) {
                len = lps[len - 1];
            }
            if (combined.charAt(i) == combined.charAt(len)) {
                len++;
            }
            lps[i] = len;
        }

        // Characters to add in front
        String add = rev.substring(0, s.length() - lps[combined.length() - 1]);
        return add + s;
    }
}
