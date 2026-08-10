
package logical;


public class Logical3 
{
      public static void main(String[] args) 
      {
         String str = "a$b+c@|:d#";

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

           
            if(!Character.isLetter(arr[left])) 
            {
                left++;
            }

            
            else if(!Character.isLetter(arr[right])) 
                   {
                       right--;
                   }

            
                else if(left<right)
                 {
                     
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                 left++;
                right--;
               
                   }
        }

        
          System.out.println(new String(arr));
                         
                    
                         
             
              
          
        
      }
    
}
