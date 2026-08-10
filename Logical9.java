
package logical;

//Rotate an array

import java.util.Arrays;

public class Logical9 
{
    
    public static void main(String[] args) 
    {
        int ar[]={1,2,3,4,5,6}; //ANS {3,4,5,6,1,2};
       
        int d=3;
          
           leftrotate(ar,d);
           System.out.println(Arrays.toString(ar));
        
        
    }
   static void rotate(int ar[],int start,int end)
   {
       while(start<end)
       {
           int temp=ar[start];
           ar[start]=ar[end];
           ar[end]=temp;
           start++;
           end--;
       }
       
   }
   static void leftrotate(int ar[],int d)
   {
       int n=ar.length;
        d=d%n;
       
       rotate(ar,0,d-1);
       
       rotate(ar,d,n-1);
       rotate(ar,0,n-1);
       
       
   }
    
}
