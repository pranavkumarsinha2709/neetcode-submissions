class Solution {
    public int[] replaceElements(int[] arr) {
        int[] newOrg = new int[arr.length];
     int max=0;
     int counter=0;
     for(int i=0;i<arr.length-2;i++)
     {
       max=getMaxSUbarray(arr,i+1,arr.length);
       newOrg[counter++]=max;
     }
    
     newOrg[counter++]=arr[arr.length-1];
     
     newOrg[arr.length-1]=-1;
     return newOrg;   
    }

    public int getMaxSUbarray(int[] arr,int start,int end)
    {
        return Arrays.stream(arr,start,end).max().getAsInt();
    }
}