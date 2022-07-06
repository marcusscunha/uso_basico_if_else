package aplicacao;

import java.util.Scanner;

public class impar_ou_par {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Número:");
		int numero = sc.nextInt();
		
		if (numero % 2==0)System.out.println("Par");
		else	System.out.println("Impar");
		sc.close();
	}

}