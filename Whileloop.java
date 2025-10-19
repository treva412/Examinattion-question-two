/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whileloop;
import java.util.Scanner;
/**
 *
 * @author VU-STUDENT
 */
public class Whileloop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of teachers: ");
        int numTeachers = scanner.nextInt();
        
        final double INTEREST_RATE = 0.05;
        int count = 1;
        
        while (count <= numTeachers) {
            System.out.print("Enter principal amount for teacher " + count + ": ");
            double principal = scanner.nextDouble();
            
            System.out.print("Enter time period (years): ");
            int time = scanner.nextInt();
            
            double investmentValue = principal * Math.pow(1 + INTEREST_RATE, time);
            
            System.out.printf("Teacher %d: Initial = UGX %.2f, Final = UGX %.2f\n", 
                            count, principal, investmentValue);
            System.out.println();
            
            count++;
        }
        
        scanner.close();
                
                
    }
}
   
