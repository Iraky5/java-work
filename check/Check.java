/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.check;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Check {

    public static void main(String[] args) {

        Scanner mem = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = mem.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
