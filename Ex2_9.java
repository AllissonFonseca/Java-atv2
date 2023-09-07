package br.fonseca;

import java.util.Scanner;

public class Ex2_9 {
	
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n;
    	
    	System.out.println("Digite um numero: ");
    	n = in.nextInt();
		
		for (int i = 1; i <=n; i++) {
		System.out.println(i);
		
		in.close();
	}
}
}


