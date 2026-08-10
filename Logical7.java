
package logical;

//find odd or even in int
public class Logical7 
{
    public static void main(String[] args) 
    {
        int ar=24567;
        
        String even=" ";
        String odd=" ";
        while(ar!=0)
        {
            int temp=ar%10;
            if(temp%2==0)
            {
                String n=String.valueOf(temp);
                even+=temp;
                
            }
            else
            {
                String n=String.valueOf(temp);
                odd+=temp;
                
                
            }
            
           ar=ar/10;
            
        }
        System.out.println("even :"+even);
        System.out.println("odd :"+odd);
        
        
    }
    
}
