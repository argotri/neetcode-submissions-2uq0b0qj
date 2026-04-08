class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int l=1;
        int sol = 1;
        int startNumber = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            int diff  = nums[i] - startNumber;
            switch(diff){
                case 0:
                    continue;
                case 1:
                    startNumber = nums[i];
                    l++;
                    if(sol < l){
                        sol = l;
                    }
                    break;
                default:
                    startNumber = nums[i];
                    if(sol < l){
                        sol = l;
                    }
                    l=1;
                    break;
            }
        }
        return sol;
    }
}
