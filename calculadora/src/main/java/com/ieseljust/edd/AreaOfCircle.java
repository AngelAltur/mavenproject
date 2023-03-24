/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.ieseljust.edd;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AreaOfCircle {

   public static void main(String args[]){
    
   Scanner s=new Scanner(System.in);
       System.out.println("Enter radius");
       double r= s.nextDouble();
       double area=(22*r*r)/7;
       System.out.println("Are of circle is:"+area);
   }
}