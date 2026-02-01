class Solution {
    public int[] twoRepeated(int[] arr) {

        int[] result = new int[2];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = Math.abs(arr[i]);

            // If already visited, it's repeating
            if (arr[val - 1] < 0) {
                result[idx++] = val;

                // Stop after finding both repeated numbers
                if (idx == 2) break;
            } else {
                // Mark as visited
                arr[val - 1] = -arr[val - 1];
            }
        }

        return result;
    }
}
