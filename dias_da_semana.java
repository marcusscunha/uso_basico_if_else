package aplicacao;

import java.util.Scanner;

public class dias_da_semana {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("N�mero:");
		
		int x = sc.nextInt();
		String dia;
		
		if (x==1) dia = "DOMINGO";
		
		else if (x==2) dia = "SEGUNDA";
		
		else if (x==3) dia = "TER�A";
		
		else if (x==4) dia = "QUARTA";
		
		else if (x==5) dia = "QUINTA";
		
		else if (x==6) dia = "SEXTA";
		
		else if (x==7) dia = "S�BADO";
		
		else dia = "VALOR INV�LIDO";
		System.out.println("Dia da semana:"+dia);
		sc.close();
	}

}
