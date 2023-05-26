package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio23Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double pesoIdeal = 0;
		
		System.out.println("Digite o seu nome: ");
	    String nome = sc.next();
		
	    System.out.println("Digite o seu sexo: ");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Digite a sua altura: ");
		float altura = sc.nextFloat();
		
		if ((sexo == 'M') || (sexo == 'm')) {
			
			pesoIdeal = 72.7 * altura - 58;
			System.out.println("O peso ideal do(a) " + nome + " é: " + pesoIdeal);	 

			
		} else if ((sexo == 'F') || (sexo == 'm')) {
			
			pesoIdeal = 62.1 * altura - 44.7;
			System.out.println("O peso ideal do(a) " + nome + " é: " + pesoIdeal);	 

			
		} else {
			
			System.out.println("Caracter inserido corresponde a nenhum sexo.");
			
		}
		
		sc.close();
		
	}

}