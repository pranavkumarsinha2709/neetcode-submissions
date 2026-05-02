class Solution {
    public boolean isAnagram(String s, String t) {
char[] chArrFirst=s.toCharArray();
char[] chArrSecond=t.toCharArray();
Arrays.sort(chArrFirst);
Arrays.sort(chArrSecond);
return Arrays.equals(chArrFirst,chArrSecond);
    }
}
