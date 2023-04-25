package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		/* Programa com sistema de repetição que somará o número digitado
		 * pelo usuario a quantidade de números digitados
		 */
		Scanner sc = new Scanner(System.in);
		int idade, soma = 0, qtd = 0;
		double media = 0;
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		do {
			soma = soma + idade;
			qtd = qtd + 1;
			media = soma/qtd;
			System.out.println("Soma: "+soma);
			System.out.println("Quantidae: "+qtd);
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();
		}while(idade>0);
	}
}