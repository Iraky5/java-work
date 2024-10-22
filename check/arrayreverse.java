/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.check;

/**
 *
 * @author USER
 */
public class arrayreverse {
   
    public static void main(String[] args) {
     
        int[] numbers = { 3, 4, 6, 1, 9, 7, 5, 8 };
        
     
        int[] reversed = new int[numbers.length];

    
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }

     
        System.out.print("Reversed array: { ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println("}");
    }
}

