/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bukotovillagebanklimited;

import java.util.Scanner;
/**
 *
 * @author maste
 */
public class whileLoop {
    int numberOfMembers;
    double[] principalAmounts;
    double interestRate;
    int timePeriod;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of members: ");
        int numberOfMembers = scanner.nextInt();
        
        double[] principalAmounts = new double[numberOfMembers];
        double interestRate;
        int timePeriod;

        int i = 0;
        // Input principal amounts for each member using while loop
        while (i < numberOfMembers) {
            System.out.print("Enter the principal amount for member " + (i + 1) + ": ");
            principalAmounts[i] = scanner.nextDouble();
            i++;
        }
        
        // Input interest rate and time period
        System.out.print("Enter the annual interest rate (in %): ");
        interestRate = scanner.nextDouble() / 100;
        
        System.out.print("Enter the time period (in years): ");
        timePeriod = scanner.nextInt();
        
        i = 0;
        // Calculate and display the final amount for each member using while loop
        while (i < numberOfMembers) {
            double finalAmount = principalAmounts[i] * Math.pow((1 + interestRate), timePeriod);
            System.out.println("The final amount for member " + (i + 1) + " after " + timePeriod + " years is: " + finalAmount);
            i++;
        }
        
        scanner.close();
    }

}
