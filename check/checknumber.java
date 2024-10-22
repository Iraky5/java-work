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
public class checknumber {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();
        
        if(num>0){
             System.out.print(num + "is positive");
        }
       else if(num<0){
              System.out.print(num + "is negative");
        }
       else{
           System.out.print(num + "is zero");
       }
        
    }
} 

