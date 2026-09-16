/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class RockPaperScissors 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        
         System.out.println("Enter your choice:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        
        int choice=sc.nextInt();
        if(choice<1||choice>3)
        {
            System.out.println("Invalid choice. Please select 1, 2, or 3.");
            return;
        }
        
        int computerchoice=random.nextInt(3)+1;
        
        String user="";
        String computer="";
        
        if (choice == 1) 
        {
            user = "Rock";
        }
        else if (choice == 2) 
        {
            user = "Paper";
        } 
        else 
        {
            user = "Scissors";
        }

          if (computerchoice == 1) 
        {
            computer = "Rock";
        }
        else if (computerchoice == 2) 
        {
             computer = "Paper";
        } 
        else 
        {
             computer = "Scissors";
        }
          System.out.println("You chose: " + user);
        System.out.println("Computer chose: " + computer);
        
           if (choice == computerchoice) {
            System.out.println("Result: Draw");
        } else if ((choice == 1 && computerchoice == 3)
                || (choice == 2 && computerchoice == 1)
                || (choice == 3 && computerchoice == 2)) {

            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        
    }
    
}
