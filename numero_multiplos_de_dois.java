package aplicacao;

import java.util.Scanner;

public class numero_multiplos_de_dois {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
System.out.println("D�gite os n�meros:");
		int numero = sc.nextInt();
		int numero2 = sc.nextInt();
		
			if(numero%numero2==0||numero%numero2==0) 	System.out.println("S�o multiplos");
			else 	System.out.println("N�o s�o multiplos");
		
		
		
				sc.close();
	}
}
