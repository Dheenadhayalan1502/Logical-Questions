
package logical;


public class Logical12 
{
      public static boolean isMountain(int[] ar)
      {
          int n=ar.length;
          int i=0;
          if(n<3)
          {
              return false;
          }
          while(i<n-1&&ar[i]<ar[i+1])
          {
              i++;
          }
          if(i==0||i==n-1)
          {
             return false; 
          }
          while(i<n-1&&ar[i]>ar[i+1])
          {
              i++;
          }
          return i==n-1;
      }

       

    public static void main(String[] args) {

        
        int[] arr = {1, 3, 3, 4, 4};

        if (isMountain(arr))
            System.out.println("Mountain Array");
        else
            System.out.println("Not a Mountain Array");
    }
    
}
