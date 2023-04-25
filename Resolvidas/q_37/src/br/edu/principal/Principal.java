package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// O programa irá receber o número de candidatos dos dois sexos e sua experiência no trabalho
		Scanner sc = new Scanner(System.in);
		double idade = 0, tot_f = 0, tot_m = 0, soma1 = 0, media_idade, calc;
		double cont_m1 = 0, cont_m2 = 0, cont_m3, cont_m4, cont_f1 = 0, menor_idade = 0; 
		int sexo, exp;
		System.out.println("Digite sua idade: ");
		idade = sc.nextDouble();
		while(idade != 0) {
			System.out.println("Digite o sexo 1 - (Masculino)   2 - (feminino):");
			sexo = sc.nextInt();
			System.out.println("Digite sua experiência 1 - (S)  2 - (N):");
			exp = sc.nextInt();
			if(sexo == 2 && exp == 1) {
				if(tot_f == 0) {
					menor_idade = idade;
				}
				else if(idade < menor_idade) {
					menor_idade = idade;
				}
			}
			if(sexo == 1) {
				tot_m = tot_m + 1;
			}
			if(sexo == 2) {
				tot_f = tot_f + 1;
			}
			if(sexo == 2 && idade < 35 && exp == 1) {
				cont_f1 = cont_f1 + 1;
			}
			if(sexo == 1 && idade > 45) {
				cont_m1 = cont_m1 + 1;
			}
			if(sexo == 1 && exp == 1) {
				soma1 = soma1 + idade;
				cont_m2 = cont_m2 + 1;
			}
			System.out.println("Digite a idade(>0) novamente ou 0 para finalizar: ");
			idade = sc.nextDouble();
		}
		System.out.println("O total feminino é de: "+(tot_f));
		System.out.println("O total masculino é de: "+(tot_m));
		calc = soma1/cont_m2;
		System.out.println("Calc = "+calc);
		calc = cont_m1 * 100/tot_m;
		System.out.println("Calc = "+calc);
	}
}