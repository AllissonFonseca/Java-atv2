package br.fonseca;

import java.util.Scanner;

public class Ex2_4 {
	
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        int num, num2;

	        System.out.println("digite o primeiro valor:");
	        num = in.nextInt();

	        do {
	            System.out.println("Digite outro valor:");
	            num2 = in.nextInt();
	            
	            if (num2 == 0) {
	            	System.out.println("Valor invalido");
	            }
	        } while (num2 == 0);
	            int res = num / num2;
	            System.out.println(res);
	            
	            in.close();
	    }

	}
