class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] temp= new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
            temp[i]=prodArr(nums, i);
        }
        return temp;
    }

      private static int prodArr(int[] nums, int index) {
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            if (index == i) {
                continue;
            }
            prod = prod * nums[i];
        }
        return prod;
    }
}  
