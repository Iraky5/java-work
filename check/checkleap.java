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
public class checkleap {
  
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = m.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

