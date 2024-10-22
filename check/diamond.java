/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.check;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class diamond {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number of rows for half of the diamond: ");
        int rows = read.nextInt();

        for (int i = 1; i <= rows; i++) {
        
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
       
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
          
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
          
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
        
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
         
            System.out.println();
        }
    }
}
    


