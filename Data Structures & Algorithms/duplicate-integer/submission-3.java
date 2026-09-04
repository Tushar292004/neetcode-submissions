class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> holder =  new HashSet<>();
        for (int i : nums){
            if (holder.contains(i)){
                return true;
            }else {
                holder.add(i);
            }
        }
        return false;
    }
}