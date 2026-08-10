
package logical;


public class Logical13 
{
    public static void LongestSubArray(int ar[])
    {
        int n=ar.length;
       int i=1;
       int left=0;
       int right=0;
        int max=0;
        while(right<n-1)
        {
             
            if(ar[i-1]<ar[i]&&ar[i]>ar[i+1])
            {
                left=ar[i];
                right=ar[i];
              while(left>0&&ar[left]>ar[1-1])
              {
                  left--;
              }
              while(right<n-1&&ar[right]>ar[i+1])
              {
                  right++;
              }
              max=Math.max(max, right-left+1);
                
                
            }
        }
        System.out.println("MAX SUBARRAY :"+max);
    }
    
    public static void main(String[] args) 
    {
        int ar[]={1,3,1,4,5,6,7,8,9,8,5,5};
        
        LongestSubArray(ar);
        
        
    }
    
}
