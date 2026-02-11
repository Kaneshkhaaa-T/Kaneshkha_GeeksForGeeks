class Solution {

    void printTriangle(int n) {
        
         for(int i=n-1;i>=0;i--){
            //space
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<(2*i)+1;j++){
                 System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}