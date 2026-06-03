class Solution {
    public boolean isAnagram(String s, String t) {

        // base condition 
        if ( s.length() != t.length() ){
            return false;
        }

        // String to Array conversion
        // String[] sArray = s.split("");
        // String[] tArray = t.split("");

        // Can also do String to Char Array
        char[] sSort = s.toCharArray(); // TC - O(N)
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort); // TC - O(N log N )
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
        //also can use this 
        // for (int i = 0; i < sArray.length; i++){
        //     if ( !sArray[i].equals(tArray[i]) ){
        //         return false;
        //     }
        // }
        // return true;
    }

    //Space Complexity
    // O(N) Because of two arrays
}
