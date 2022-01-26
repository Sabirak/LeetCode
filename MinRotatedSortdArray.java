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


Binary Search Solution

class Solution {
    public int findMin(int[] nums) {
        
       int l=0,r=nums.length-1;
        
       int mid=0;
        
        while(l<r){
            
            //array is sorted
            if(nums[l]<nums[r]){ 
                
                return nums[l];
            }
            
           mid=(r+l)/2;
        
          if(nums[mid]<nums[l]){
              r=mid;
          }
            
          else{
              
              l=mid+1;
          }
        }
        
        return nums[r];
        
    }
}
