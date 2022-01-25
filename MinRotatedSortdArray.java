// Question number 153 in Leetcode

// first solution
class Solution {
    public int findMin(int[] nums) {
        
        int firstElement = nums[0];
        int i = nums.length-1;
        int incidentElm =0;
        if(firstElement<nums[i]){
            
            return firstElement;
        }
        
        if(i==0){
            return firstElement;
        }
        
       while(true){
                  
            if(nums[i]<firstElement){   
                incidentElm=nums[i];
                i--;  
            }
            
            else{
                break;
            }
           
        }
        
        return incidentElm;
        
    }
}
