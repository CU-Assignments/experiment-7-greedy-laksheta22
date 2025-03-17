import java.util.PriorityQueue;

class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        for (int pile : piles) {
            maxHeap.add(pile);
        }
        
        for (int i = 0; i < k; i++) {
            int maxPile = maxHeap.poll(); 
            maxPile -= maxPile / 2; 
            maxHeap.add(maxPile);
        }
        
        int totalStones = 0;
        while (!maxHeap.isEmpty()) {
            totalStones += maxHeap.poll();
        }
        
        return totalStones;
    }
}
