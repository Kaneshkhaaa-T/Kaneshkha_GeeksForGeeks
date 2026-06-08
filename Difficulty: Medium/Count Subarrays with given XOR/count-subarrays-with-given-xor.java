class Solution {
	public long subarrayXor(int nums[], int k) {
		Map<Integer, Integer> mpp = new HashMap<>();
		int xr = 0, count = 0;
		mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
		for (int i = 0; i<nums.length; i++) {
			xr = xr^nums[i];
			int x = k^xr;
			count = count + mpp.getOrDefault(x, 0);
			mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
		}
		return count;
	}
}
