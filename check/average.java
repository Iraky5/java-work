/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.check;

/**
 *
 * @author USER
 */
public class average {
  
    public static void main(String[] args) {
      
        int[] numbers = { 10, 12, 34, 23, 56, 78 };
         double average;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

    
        average =  sum / numbers.length;

      
        System.out.println("The average: " + average);
    }
}
 

