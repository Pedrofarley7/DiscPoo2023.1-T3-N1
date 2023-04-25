package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		/* Programa que salva a média das alturas e imprime a 
		 * que for maior e qual o sexo dessa altura
		 */
		// sem exportar
		Scanner sc = new Scanner(System.in);
		double altura = 0, cont, maior= 0, menor=0, media, soma=0, mediaf, somaf=0, cf=0, cm=0;
		String sexo ="", maior_sexo= "";
		for (cont = 0; cont <16; cont++) {
			System.out.println("Digite o sexo: ");
			System.out.println("Digite *M* para masculino");
			System.out.println("Digite *F* para feminino");
			sexo = sc.next().toUpperCase();
			System.out.println("Digite a altura: ");
			altura = sc.nextDouble();
			if (cont == 1) {
				maior = altura;
				maior_sexo = sexo;
				menor = altura;	
			} else {
				if (altura> maior) {
					maior = altura;
					maior_sexo = sexo;
				}
			} if (altura<menor) {
				menor = altura;
			}
			if (sexo == "F") {
				somaf = somaf + altura;
				cf = cf + 1;
				} else {
					cm = cm +1;
				}
			System.out.println("A maior altura é: " + maior);
			System.out.println("A menor altura é: " + menor);
			
			if (cf == 0 ) {
				mediaf = 0;
			} else {
				mediaf = somaf/cf;
			}
			System.out.println("A média feminina é: " + mediaf);
			System.out.println("Cm: " + cm);
			System.out.println("O sexo que tem a maior altura é: " + maior_sexo);
			
			
		}
		
	}
}