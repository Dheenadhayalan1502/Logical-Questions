/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

/**
 *
 * @author USER
 */
import java.util.*;
public class Logical14 
{
    public static void main(String[] args) {
        int[] clocks = {3, 7, 5, 9};

        int total = 0;
        int highest = clocks[0];

        for (int hour : clocks) {
            total += hour;

            if (hour > highest) {
                highest = hour;
            }
        }

        System.out.println("(" + total + ", " + highest + ")");
    }
    
}
