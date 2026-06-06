class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for( String s : strs){
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> decoded = new ArrayList<>();
        int i = 0;
        while ( i < str.length()){
            int hashIndex = str.indexOf('#', i); // i defines starting point

            int wordLength = Integer.parseInt(str.substring(i, hashIndex));

            int wordStartIndex = hashIndex + 1;
            int wordEndIndex = wordStartIndex + wordLength;

            String word = str.substring(wordStartIndex, wordEndIndex);

            decoded.add(word);

            i = wordEndIndex;
        }
        return decoded;
    }
}
// TC - O(m + n)
// SC - O(m + n)
//Where m is the sum of lengths of all the strings and n is the number of strings.
