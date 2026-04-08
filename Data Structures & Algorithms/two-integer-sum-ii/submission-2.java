class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int beginingPointer=0;
        int endPointer=numbers.length-1;
        while(beginingPointer< endPointer){
            // end pointer will be decreasing
            // if(numbers[endPointer] > target){
            //     endPointer--;
            //     continue;
            // }
            // calculate the begining + end pointer
            int res = numbers[beginingPointer] + numbers[endPointer];
            if(res > target){ // jika result lebih besar daripada target , maka end pointer dikurangin
                endPointer--;
            }else if (res < target){ // jika result lebih kecil daripada target , maka begining pointer nambah ++
                beginingPointer++;
            }else{ // jika exac sama , berarti nemu solusi
                break;
            }
        }
        int[] result = {beginingPointer+1 , endPointer+1};
        return result;
    }
}
