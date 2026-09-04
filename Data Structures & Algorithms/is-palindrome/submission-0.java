class Solution {
    public boolean isPalindrome(String s) {
        String smini = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String sreverse = new StringBuilder(smini).reverse().toString();
        return smini.equals(sreverse);

    }
}



