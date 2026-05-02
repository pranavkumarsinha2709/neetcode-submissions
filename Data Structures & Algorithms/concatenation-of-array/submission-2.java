class Solution {
    public int[] getConcatenation(int[] nums) {
       int[] concatArr= new int[nums.length+nums.length];
       int count=0;
       int counter=0;
       while(counter<2){
        counter++;
       for(int i=0;i<nums.length;i++) 
       {
        concatArr[count++]=nums[i];
       }
       }

       return concatArr;
    }
}