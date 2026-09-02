class Solution {
    public boolean uniformArray(int[] nums1) {

        int even = 0;
        int odd = 0;

        for (int i = 0; i < nums1.length; i++) {

            if (nums1[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        // Already uniform
        if (even == 0 || odd == 0)
            return true;

        // If both parities exist, subtraction can make
        // all elements have the same parity.
        return true;
    }
}