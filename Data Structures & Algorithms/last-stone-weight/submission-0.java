class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0) {
            return 0;
        } else if (stones.length == 1) {
            return stones[0];
        }

        while (stones.length > 1) {
            Arrays.sort(stones);

            int[] sortedArray = new int[stones.length - 1];
            int heaviest = stones[stones.length - 1];
            int secondHeaviest = stones[stones.length - 2];

            if (heaviest == secondHeaviest) {
                // Remove the two last elements
                for (int i = 0; i < sortedArray.length - 1; i++) {
                    sortedArray[i] = stones[i];
                }
            } else {
                // Smash the two heaviest stones and keep the result
                int newStone = heaviest - secondHeaviest;
                for (int i = 0; i < sortedArray.length - 1; i++) {
                    sortedArray[i] = stones[i];
                }
                sortedArray[sortedArray.length - 1] = newStone;
            }

            stones = sortedArray;
        }

        return stones.length == 0 ? 0 : stones[0];
    }
}