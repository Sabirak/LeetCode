class Solution {
    public boolean isPalindrome(int org_number) {
        
        if(org_number<0){
            return false;
        }
        
        int temp_num=org_number,reverse_num=0;
        
        while(temp_num>0){
            reverse_num=reverse_num*10+temp_num%10;
            temp_num=temp_num/10;
        }
        if(reverse_num==org_number){
            return true;
        }
        else{
            return false;
        }  
    }
}
