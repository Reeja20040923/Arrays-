class Solution {
    public int findNumbers(int[] nums) {
        int digits = 0;
        for(int i=0;i<nums.length;i++){
            String Num = Integer.toString(nums[i]);
            if(Num.length()%2==0){
                digits++;
            }
        }
        return digits;
        
    }
}
