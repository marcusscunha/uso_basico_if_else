package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Quais foram as notas?");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
		double notafinal = (nota1+nota2+nota3)/3.0;
	
		System.out.printf("Notas:%.1f%n",notafinal);
		if (notafinal>=7)System.out.println("Aprovado");
		
		else System.out.println("Reprovado");
		
		sc.close();
	}

}
