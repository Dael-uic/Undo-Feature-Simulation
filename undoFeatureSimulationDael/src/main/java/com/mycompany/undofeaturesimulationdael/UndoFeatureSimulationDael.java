/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.undofeaturesimulationdael;

import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author user
 */
public class UndoFeatureSimulationDael {

    public static void main(String[] args) {
        Scanner scanlation = new Scanner(System.in);

        System.out.println("@----------------------------------------Commands--------------------------------------------@\nType \"undo\" to undo the last inputted name.\nType print to print current contents of stack.\nType \"exit\" to exit program.\nCommands can either be written in lowercase or uppercase as long as it has the same spelling.\n@--------------------------------------------------------------------------------------------@\n\n");
        System.out.print("Enter a list of names to list down: ");
        
        Stack<String> stacksofnames = new Stack<>(); //Stack to store names
    
        while (true) {
            String names = scanlation.nextLine();
            if (names.toLowerCase().equals("undo")) {
                if (!stacksofnames.isEmpty()) {
                    stacksofnames.pop();
                    System.out.println("Undo Last action.");
                } else if (stacksofnames.isEmpty()) {
                    System.out.println("No names available in the current stack.");
                }
            } else if (names.toLowerCase().equals("print")) {
                System.out.println("Current stack contents: \n" + stacksofnames);
            } else if (names.toLowerCase().equals("exit")) {
                System.out.println("Exiting program.");
                break;
            } else {
                stacksofnames.push(names);
            }
        
        }
    }
}