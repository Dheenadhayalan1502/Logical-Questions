/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

/**
 *
 * @author USER
 */
public class TotalAndMaximum 
{
    
    public static void main(String[] args) {

        double[] weights = {1.2, 0.5, 2.3, 1.8};

        double total = 0;
        double heaviest = weights[0];

        for (double weight : weights) {
            total += weight;

            if (weight > heaviest) {
                heaviest = weight;
            }
        }

        System.out.println("(" + total + ", " + heaviest + ")");
    }

    
}
