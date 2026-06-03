class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> result =  new HashMap<>();

       for (String currentString: strs){

        int[] count = new int[26];

        //key generation
        for ( char c : currentString.toCharArray() ){
            count[c - 'a']++;
        }
        String wordKey = Arrays.toString(count);
        // adding key
        if ( !result.containsKey(wordKey) ) {
            result.put(wordKey, new ArrayList<>());
        }
        // adding the string related to that key
        result.get(wordKey).add(currentString);

       }

        // Creating arraylist with values of the hashmap
       return new ArrayList<>(result.values());
    }
}

//Time Complexity - O ( N * M)
//Space Complexity - O ( N * M)

