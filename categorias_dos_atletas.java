package aplicacao;

import java.util.Scanner;

public class categorias_dos_atletas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a idade:");
		
		int idade = sc.nextInt();
		
		if (idade<9) System.out.println("Categoria: Mirim"); 
		
		else if (idade>=14 && idade<18) System.out.println("Categoria: Juvenil");
		
		else if (idade>=9 && idade<14) System.out.println("Categoria: Infantil");
		
		else System.out.println("Categoria: Adulto");
		
		sc.close();
	}

}
