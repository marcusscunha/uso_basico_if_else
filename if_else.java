package aplicacao;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	int hora;	
	System.out.println("Horas?");
	hora = sc.nextInt();
		if(hora<12) {
			System.out.println("bom dia, cara");
			}
		else{
			System.out.println("boa tarde, cara");
			}
	sc.close();
	}

}
