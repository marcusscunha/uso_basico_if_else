package aplicacao;

import java.util.Scanner;

public class numero_multiplos_de_dois {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
System.out.println("Dígite os números:");
		int numero = sc.nextInt();
		int numero2 = sc.nextInt();
		
			if(numero%numero2==0||numero%numero2==0) 	System.out.println("São multiplos");
			else 	System.out.println("Não são multiplos");
		
		
		
				sc.close();
	}
}
