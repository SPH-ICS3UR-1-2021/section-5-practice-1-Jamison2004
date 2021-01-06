/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        
      Scanner input = new Scanner(System.in);
        System.out.println("Enter a color code.");
        int num;
        num = Integer.parseInt(input.next());
     input.close();
      
     if (num<380){
          System.out.println("The entered waveleth is not part of the visible spectrum");
          
      } else if (num<450){
          System.out.println("The colour is Violet");
          
      } else if (num<495){
          System.out.println("The colour is Blue");
          
      }else if (num<570){
          System.out.println("The colour is Green");
          
      } else if (num<590){
          System.out.println("The colour is Yellow");
          
      } else if (num<620){
          System.out.println("The colour is Orange");
          
      } else if (num<750){
          System.out.println("The colour is Red");
          
      } else{
          System.out.println("The entered waveleth is not part of the visible spectrum"); 
          
      }
        }
    }
