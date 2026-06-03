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