package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] agrs) {
		// O programa irá recebar o sexo de uma pessoa, suas horas trabalhadas e um código
		Scanner sc = new Scanner(System.in);
		double num_h, sal_b, sal_l = 0, media_m = 0, media_f = 0, cont_m = 0, cont_f = 0;
		int sexo, cod;
		System.out.println("Digite o código: ");
		cod = sc.nextInt();
		while(cod != 99999) {
			System.out.println("Digite o sexo  1 - (masculino)  2 - (feminino):");
			sexo = sc.nextInt();
			System.out.println("Digite o número de horas: ");
			num_h = sc.nextDouble();
			sal_b = num_h * 18.50;
			if(sexo == 1) {
				sal_l = sal_b - (sal_b * 10/100);
				media_m = media_m + sal_l;
			}
			if(sexo == 2) {
				sal_l = sal_b - (sal_b * 5/100);
				media_f = media_f + sal_l;
				cont_f = cont_f + 1;
			}
			System.out.println("Código: "+cod);
			System.out.println("Salário bruto: "+sal_b);
			System.out.println("Salário líquido: "+sal_l);
			System.out.println("Digite um outro código ou (99999) para encerrar: ");
			cod = sc.nextInt();
		}
		media_m = media_m / cont_m;
		media_f = media_f / cont_f;
		System.out.println("Média Masculino: "+media_m);
		System.out.println("Média Feminina: "+media_f);
	}
}