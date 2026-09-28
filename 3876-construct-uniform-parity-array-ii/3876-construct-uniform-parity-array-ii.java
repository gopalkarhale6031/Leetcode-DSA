class Solution {
    public boolean uniformArray(int[] nums1) {

        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int num : nums1) {

            if (num % 2 == 0) {
                minEven = Math.min(minEven, num);
            } else {
                minOdd = Math.min(minOdd, num);
            }
        }

        // Only even numbers
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }

        // Only odd numbers
        if (minEven == Integer.MAX_VALUE) {
            return true;
        }

        // Mixed parity:
        // minimum even must be greater than minimum odd
        return minEven > minOdd;
    }
}