
package logical;

import java.util.Arrays;


public class Logical4 
{
    public static void main(String[] args) 
    {
        int ar[]={1,4,5,2,4,1,7,8,5};
       
        int slow=0;
       
        Arrays.sort(ar); //112445578
       
        for (int fast = 1 ; fast< ar.length; fast++) 
        {
            if(ar[slow]!=ar[fast])
            {
                slow++;
                ar[slow]=ar[fast];
                               
                
            }
            int size=slow+1;
            
            
               
            
        }
        int Length=slow+1;
        System.out.println(Arrays.toString(ar));
        
        for(int i = 0; i <Length; i++)
        {
            System.out.print(ar[i] + " ");
        }
        
    }
    
}
