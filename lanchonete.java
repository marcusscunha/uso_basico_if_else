package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Qual seu pedido?");
	
	int codigo = sc.nextInt();
	int quantidade = sc.nextInt();
	
	double total;
	
	if (codigo ==1)total=quantidade*4.0;
	
	else if (codigo==2)total=quantidade*4.50;
	
	else if (codigo==3)total=quantidade*5.00; 
	
	else total=quantidade*1.50; 
	
	System.out.printf("Total:R$ %.2f",total);
	sc.close();
	}
}
