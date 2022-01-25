// Question number 153 in Leetcode

// first solution
class Solution {
    public int findMin(int[] nums) {
        
        int firstElement = nums[0];
        int i = nums.length-1;
        
        if(firstElement<nums[i]){
            
            return firstElement;
        }
        
        if(i==0){
            return firstElement;
        }
        
       while(true){
                  
            if(nums[i]<firstElement){   
                i--;  
            }
            
            else{
                break;
            }
           
        }
        
        return nums[i+1];
        
    }
}
