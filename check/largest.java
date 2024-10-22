/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.check;

import java.util.Scanner;

/**
 *
 * @author USER
 */
 import java.util.Scanner;
public class largest {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for three numbers
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3) {
          System.out.println("The greatest number is: " + num1);
          }
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The greatest number is: " + num2);
        }
        else {
           System.out.println("The greatest number is: " + num3);
        }
        
    }
}


