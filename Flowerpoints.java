/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

/**
 *
 * @author USER
 */
public class Flowerpoints 
{
     public static void main(String[] args) {

        int[] flowers = {5, 3, 8, 2};

        int total = 0;

        for (int i = 0; i < flowers.length; i++) {
            total = total + flowers[i];
        }

        System.out.println(total);
    }
    
}
