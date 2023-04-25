package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Programa que mostra o valor da divida, com juros, e a quantidade de parcelas, baseado na tabela
		Scanner sc = new Scanner(System.in);
		double valor_inicial, juros, valor_parc, total, valor_juros, num_parc;
		int i = 0;
		System.out.println("Digite o valor inicial da dívida: ");
		valor_inicial= sc.nextDouble();
		juros = 0;
		num_parc = 1;
		total = valor_inicial;
		valor_parc = valor_inicial;
		System.out.println("Total: "+total);
		System.out.println("Juros: "+juros);
		System.out.println("Números de parcelas: " +num_parc);
		System.out.println("Valor das parcelas: " +valor_parc);
		juros = juros + 10;
		num_parc = num_parc +2;
		for(i = 0; i<5 ;i++) {
			valor_juros = valor_inicial*juros/100;
			total = valor_inicial + valor_juros;
			valor_parc = total/num_parc;
			System.out.println("O total: "+total);
			System.out.println("Valor do juros: "+valor_juros);
			System.out.println("Número de parcelas: "+num_parc);
			juros = juros + 5;
			num_parc = num_parc + 3;
		}
	}
}