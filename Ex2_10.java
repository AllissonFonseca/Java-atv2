package br.fonseca;

import java.util.Scanner;

public class Ex2_10 {
	
	  public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);
	    	int n;
	    	
	    	do {
	    	System.out.println("Digite um numero: ");
	    	n = in.nextInt();
			
	    	   if (n <= 0) {
	    		System.out.println("Valor invalido");
	    	  }
	    	
	    	} while (n <= 0);
	    		
			for (int i = 1; i <=n; i++) {
			System.out.println(i);
			
			in.close();
		}
 }
}



