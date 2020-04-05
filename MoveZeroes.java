class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount ++;
            } else {
                nums[i - zeroCount] = nums[i]; 
            } 
        }
        
        for (int i = nums.length - 1; zeroCount > 0 ; i--) {
            nums[i] = 0;
            zeroCount--;
        }
    }
}
