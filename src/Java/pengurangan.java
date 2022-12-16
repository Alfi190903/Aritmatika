/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class pengurangan {
    public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
	
		int angka1;
		int angka2;
		int jumlah;
                System.out.println("Pengurangan");
		System.out.print("Masukkan angka pertama : ");
		angka1= input.nextInt();
		System.out.print("Masukkan angka kedua : ");
		angka2 = input.nextInt();
	
		jumlah = angka1 - angka2;
	
		System.out.println("Jumlahnya : "+jumlah);
	}
}
