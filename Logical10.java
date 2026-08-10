
package logical;

public class Logical10 
{
    public static void main(String[] args) 
    {
        int ar[]={1, 3, 1, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5};
        System.out.println(longestsubarray(ar));
        
        
    }
    public static  int longestsubarray(int ar[])
    {
        int n=ar.length;
        int max=0;
        int i=1;
        while(i<n-1)
        {
            if(ar[i]>ar[i-1]&&ar[i]>ar[i+1])
            {
                int left=i;
                int right=i;
                
                while(left>0&&ar[left]>ar[left-1])
                {
                    left--;
                }
                while(right<n-1&&ar[right]>ar[right+1])
                {
                    right++;
                }
                max=Math.max(max, right-left+1);
                i=right;
            }
            else
            {
                i++;
            }
           
            
        }
        return max;
        
    }
    
}
