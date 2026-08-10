package logical;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logical 
{

    public static void main(String[] args) throws InterruptedException {
        String name = "hi Iam dheena";

        for (int i = 0; i < name.length(); i++) {
           
            System.out.println(name.charAt(i));
             Thread.sleep(1000);
            if (name.charAt(i) == ' ') {
                Thread.sleep(5000);
                System.out.println(name.charAt(i));

            }
        }

    }

}
