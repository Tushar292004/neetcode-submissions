class Solution {
    public boolean isAnagram(String s, String t) {

        // base condition 
        if ( s.length() != t.length() ){
            return false;
        }

        String[] sArray = s.split("");
        String[] tArray = t.split("");
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for (int i = 0; i < sArray.length; i++){
            if ( !sArray[i].equals(tArray[i]) ){
                return false;
            }
        }

        return true;
    }
}
