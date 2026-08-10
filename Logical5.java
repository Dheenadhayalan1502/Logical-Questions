
package logical;

//no repating char in string
public class Logical5 
{
    public static void main(String[] args) 
    {
        String s="aabbcdde";
        
        
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            char ch1=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                char ch2=s.charAt(j);
                if(ch1==ch2)
                {
                    count++;
                    
                }
                
                
            }
            if(count==1)
                {
                    System.out.println("non repating charater :"+s.charAt(i));
                }
        }
        
        
    }
    
}
