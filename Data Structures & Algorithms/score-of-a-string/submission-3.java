class Solution {
    public int scoreOfString(String s) {
        if(s.length()==1){
        return 0;
        }
        int sum=0;
        int charFirst=s.charAt(0);
    for(int i=1;i<s.length()-1;i++)
    {
    int firstAscii=(int)s.charAt(i);
    int secondAscii=(int)s.charAt(i+1);
    sum+=sum=Math.abs(firstAscii-secondAscii);
     
  }
  int secondCHar=(int)s.charAt(1);
  sum=sum+Math.abs(charFirst-secondCHar);
        return sum;
    }
}