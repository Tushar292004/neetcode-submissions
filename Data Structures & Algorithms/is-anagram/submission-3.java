class Solution {
    public boolean isAnagram(String s, String t) {
        if ( s.length() != t.length()){
            return false;
        }

        int[] charCount = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
        charCount[s.charAt(i) - 'a']++;
        charCount[t.charAt(i) - 'a']--;
        }

        for ( int count : charCount){
            if (count != 0){
                return false;
            }
        }

        return true;
    }
}

//Time Complexity: O(N) length of the string 
//Space Complexity: Because the memory used does not grow with the input size, it operates in O(1) constant space.
