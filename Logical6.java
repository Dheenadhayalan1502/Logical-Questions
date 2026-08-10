
package logical;

//prefix sum
public class Logical6 
{
    public static void main(String[] args) 
    {
        int ar[]={2,4,6,8,10};
        int []prefix=new int[ar.length];
        prefix[0]=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            prefix[i]=prefix[i-1]+ar[i];
        
        }
        
        
    }
    
    
}
