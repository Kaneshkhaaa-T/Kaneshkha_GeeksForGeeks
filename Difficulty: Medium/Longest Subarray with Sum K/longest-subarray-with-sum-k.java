// User function Template for Java

class Solution {
	public int longestSubarray(int[] nums, int k) {
		Map<Integer, Integer> mpp = new HashMap<>();
		int sum = 0;
		int length = 0;
		for (int i = 0; i<nums.length; i++) {
			sum = sum + nums[i];
			if (sum == k)
				length = Math.max(i + 1, length);
			
			int rem = sum - k;
			if (mpp.containsKey(rem))
				length = Math.max(i - mpp.get(rem), length);
			
			 if (!mpp.containsKey(sum)) {
                mpp.put(sum, i);
            }
		}
		return length;
	}
}
