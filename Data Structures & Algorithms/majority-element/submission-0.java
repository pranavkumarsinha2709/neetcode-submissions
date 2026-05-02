class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new LinkedHashMap<>();
       for (int num : nums) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
      }
   return  freq.entrySet().stream().filter(a->a.getValue()>nums.length/2)
     .map(a->a.getKey()).findFirst().get();
    }
}