package aplicacao;

import java.util.Scanner;

public class dias_da_semana {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Número:");
		
		int x = sc.nextInt();
		String dia;
		
		if (x==1) dia = "DOMINGO";
		
		else if (x==2) dia = "SEGUNDA";
		
		else if (x==3) dia = "TERÇA";
		
		else if (x==4) dia = "QUARTA";
		
		else if (x==5) dia = "QUINTA";
		
		else if (x==6) dia = "SEXTA";
		
		else if (x==7) dia = "SÁBADO";
		
		else dia = "VALOR INVÁLIDO";
		System.out.println("Dia da semana:"+dia);
		sc.close();
	}

}
