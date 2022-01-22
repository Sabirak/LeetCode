// BRUTE FORCE SOLUTION

import static java.lang.Math.min;
import static java.lang.Math.max;
class Solution {
    public int maxArea(int[] height) {
        
        //brute force soln
        int area=0;
        
        for(int i=0;i<height.length-1;i++){
              
            for(int j=i+1;j<height.length;j++){
                
                         
                    if((min(height[i],height[j])*(j-i))>area){
                        area=(min(height[i],height[j])*(j-i));
                    }
                
                         
            
            }
        }
        
        return area;
        
    }
}
