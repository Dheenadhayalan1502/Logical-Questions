
package logical;


public class Logical2 
{
    public static void main(String[] args) 
    {
        int ar[]={1,0,3,0,4,0,5,6,7};
        int left=0;
        int right=ar.length-1;
        while(left<right)
        {
            if(ar[left]!=0)
            {
                left++;
                
            }
            else if(ar[right]==0)
            {
                right--;
            }
            else if(left<right)
            {
                int temp=ar[left];
                ar[left]=ar[right];
                ar[right]=temp;
            }
                   
            
        }
        for(int arr:ar)
        {
            System.out.print(arr);
        }
        
    }
            
    
}
