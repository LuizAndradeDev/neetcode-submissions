class Solution {
    public boolean hasDuplicate(int[] nums) {
          Boolean isUnique = false;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                isUnique = true;
                break;
            }
        }
        return isUnique;
    }
}