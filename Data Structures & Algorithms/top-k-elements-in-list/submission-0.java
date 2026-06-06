class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Store with frequency 
        HashMap< Integer, Integer> resultHolder = new HashMap<>();
        for ( int n : nums){
            resultHolder.put(n, resultHolder.getOrDefault(n, 0) + 1);
        }

        //Create Priority Queue
        PriorityQueue< int[] > heap = new PriorityQueue<>( (a, b) -> a[0] - b[0]);

        //Processing the leader board
        for( Map.Entry<Integer, Integer> entry : resultHolder.entrySet() ){
            heap.offer( new int[]{ entry.getValue(), entry.getKey()} );

            if( heap.size() > k) {
                heap.poll(); // remove top element
            }
        }

        int[] result = new int[k];
        for( int i = 0; i < k; i++){
            result[i] = heap.poll()[1]; //only want number, not the frequencies
        }

        return result;

    }
}
