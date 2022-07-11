package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class imposto_de_renda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("S�lario bruto:");
		double salario = sc.nextDouble();

		double imposto;
		if (salario <= 2000.00)
			imposto = 0.0;

		else if (salario <= 3000.00)
			imposto = (salario - 2000) * 0.08;
		
		else if (salario <= 4500.00)
		
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
			
		else
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		if (imposto == 0.0)
			System.out.println("Isento");
		else System.out.printf("Valor a pagar: R$%.2f",imposto);
	
		sc.close();
	}

}
