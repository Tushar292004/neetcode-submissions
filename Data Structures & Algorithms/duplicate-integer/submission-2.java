class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> holder = new HashSet<>();
        for ( int num : nums){
            if ( holder.contains(num)){ return true; }
            else { holder.add(num); }
        } 
        return false;
    }
}

// Time complexity - O(N)
// holder.contains(num) and doing holder.add(num) both operate in O(1) average time. Therefore, the total time is directly proportional to the size of the array, O(N).

// Space complexity - O(N)
// In the worst-case scenario (where there are no duplicates, e.g., [1, 2, 3, 4]), we will end up adding every single element of the array into the HashSet. Thus, the memory required scales linearly with the input size.
