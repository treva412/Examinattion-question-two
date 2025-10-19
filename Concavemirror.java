/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concavemirror;

import java.util.Scanner;

/**
 *
 * @author VU-STUDENT
 */
public class Concavemirror {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the image distance v (in cm, positive for real image): ");
        double v = input.nextDouble();

        System.out.print("Enter the object distance u (in cm, negative for concave mirror): ");
        double u = input.nextDouble();

        double f = 1 / ((1 / v) + (1 / u));

        System.out.printf("Calculated focal length f = %.2f cm%n", f);

        if (f >= 21.0 && f <= 25.0) {
            System.out.println("✅ The focal length lies within the range 21.0 cm to 25.0 cm.");
        } else {
            System.out.println("❌ The focal length is outside the range 21.0 cm to 25.0 cm.");
        }

        input.close();
    }
}
