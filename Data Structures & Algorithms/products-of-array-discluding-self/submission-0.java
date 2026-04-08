class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] sol = new int[nums.length];
        int zeroFound = 0; // if zero is found only one the other element are 0 except the int zero
        int totalCounter=-99999999;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]!=0){
                sol[i] = -21; // temporary number not 0
                if(totalCounter==-99999999){
                    totalCounter = 1 * nums[i];
                }else{
                    totalCounter = totalCounter * nums[i];
                }
                
            }else{
                sol[i] = 0;// inject where 0 are located
                zeroFound++;
                if(zeroFound > 1){
                    break; // break if zerofound is more than 2
                }
            }
        }
        
        for(int i = 0 ; i < nums.length ; i++){
            if(zeroFound >1){
                sol[i] = 0;
                continue;
            }
            if(zeroFound==1){
                if(sol[i]==0){
                    sol[i] = totalCounter;
                }else{
                    sol[i] = 0 ;
                }
                continue;
            }
            sol[i] = totalCounter / nums[i];
        }   
        return sol;
    }
}  
