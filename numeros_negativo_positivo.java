package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class numeros_negativo_positivo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o nùmero:");
		double numero = sc.nextDouble();
		
		if	(numero>=0)System.out.printf(numero+"%nPositivo");
		else System.out.printf(numero+"%nNegativo");
		sc.close();
	}

}
