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
public class grade {
  
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = read.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println(" keep it up.");
                break;
            case 'D':
                System.out.println("pass!");
                break;
            case 'F':
                System.out.println("failed!");
                break;
            default:
                System.out.println("Invalid grade entered.");
        }
    }
}

