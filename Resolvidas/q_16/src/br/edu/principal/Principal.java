package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// A soma do intervalo dos números pares e a multiplicação do números ímpares
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma = 0, mult = 1, i;
		System.out.println("Digite 1° número: ");
		num1 = sc.nextInt();
		System.out.println("Digite 2° número: ");
		num2 = sc.nextInt();
		if(num1 == num2) {
			if(num1%num2 == 0) {
				soma = soma + num1;
			} else {
				mult = mult * 1;
				
			}
		}
		else if(num1 < num2) {
			for(i = 0; num1 >= num2; i ++) {
				if(i%2 == 0) {
					soma = soma + i;
				} else {
					mult = mult * i;
				}
			}
		}
		else if(num1 > num2) {
			for( i = 0; num2 >= num1; i ++) {
				if(i%2 == 0) {
					soma = soma + i;
					mult = mult * i;
				}
			}
		}
		System.out.println("Soma: "+soma);
		System.out.println("Multiplicação: "+mult);
	}
}