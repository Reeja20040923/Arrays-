class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxconsecutiveones = 0;
        int currentconsecutiveones = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currentconsecutiveones++;
            }
            else{
                maxconsecutiveones = Math.max(maxconsecutiveones,currentconsecutiveones);
                currentconsecutiveones = 0;
            }
        }
        maxconsecutiveones = Math.max(maxconsecutiveones,currentconsecutiveones);
        return maxconsecutiveones;
        
    }
}
