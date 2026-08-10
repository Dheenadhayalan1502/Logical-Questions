
package logical;


public class Logical8 
{
    public static void main(String[] args) 
    {
        

        String str = "1xy2z4";

        String letters = "";
        String numbers = "";

        for (int i = 0; i < str.length(); i++) 
        {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) 
            {
                letters += ch;
            } else if (Character.isDigit(ch)) 
            {
                numbers += ch;
            }
        }

        System.out.println("Characters: " + letters);
        System.out.println("Numbers: " + numbers);
    }

        
    
    
}
