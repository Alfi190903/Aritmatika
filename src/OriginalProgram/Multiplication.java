/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OriginalProgram;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Multiplication {
    public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
	
		int X,Y,Z;
                System.out.println("MULTIPLICATION Of Numbers");
		System.out.print("Nilai X : ");
		X = input.nextInt();
		System.out.print("Nilai Y : ");
		Y = input.nextInt();
	
		Z = X * Y;
	
		System.out.println("X * Y = "+Z);
	}
}
