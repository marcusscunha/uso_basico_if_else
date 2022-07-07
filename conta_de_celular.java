package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class conta_de_celular {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Minutos consumidos:");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if(minutos>100) conta = conta + (minutos-100)*2.0;
		System.out.printf("Valor da conta = R$ %.2f",conta);
		
		sc.close();
	}

}
