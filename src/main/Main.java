/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ManagerEquation;
import controller.ManagerEquation;
import view.Menu;

/**
 *
 * @author This PC
 */
public class Main {
    public static void main(String[] args) {
        String title= "Equation Program";
        String[] s= new String[] {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
        Menu<String> menu= new ManagerEquation(title, s);
        menu.run();
    }
}