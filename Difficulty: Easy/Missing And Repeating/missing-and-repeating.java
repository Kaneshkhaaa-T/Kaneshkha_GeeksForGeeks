class Solution {
	ArrayList<Integer> findTwoElement(int nums[]) {
		
		int n = nums.length;
		long s = (long) n * (n + 1) / 2;
		long sn = (long)n * (n + 1) * (2 * n + 1) / 6;
		long s1 = 0;
		long s2 = 0;
		for (int i = 0; i<n; i++) {
			s1 = nums[i] + s1;
			s2 += (long)nums[i]*nums[i];
		}
		long val1 = s1 - s;
		long val2 = s2 - sn;
		val2 = val2/val1;
		
		long repeating = (val1 + val2)/2;
		long missing = val2 - repeating;
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add((int)repeating);
		ans.add((int)missing);
		return ans;
		
	}
}
