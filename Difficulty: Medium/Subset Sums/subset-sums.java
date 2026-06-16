// User function Template for Java//User function Template for Java
class Solution {
    
    public void function(int indx, int sum, int[] arr,int n, ArrayList<Integer> ans) {
            if(indx==n){
                ans.add(sum);
                return;
            }   
            function(indx+1,sum+arr[indx],arr,n,ans);
            function(indx+1,sum,arr,n,ans);
    }
    
    public ArrayList<Integer> subsetSums(int[] arr) {
        
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        function(0,0,arr,n,ans);
        Collections.sort(ans);
        return ans;
        
    }
}