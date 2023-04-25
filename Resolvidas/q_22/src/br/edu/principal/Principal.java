package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Números de crianças falecidas em um periodo, sendo Masculino e feminino, e menor de 24
		Scanner sc = new Scanner(System.in);
		int num_cri, meses, sexo = 0;
		double porc24 = 0,porc_f = 0,porc_m = 0,tot_f = 0, tot_m = 0,tot24 = 0;
		System.out.println("Digite o número de crianças nascidas no período: ");
		num_cri = sc.nextInt();
		for( int i = 1; i<=num_cri; i++) {
			System.out.println("Digite o sexo da "+i+ "° criança, 1 - (Masculino)  2 - (Feminino): ");
			sexo = sc.nextInt();
			if(sexo == 1) {
				tot_m = tot_m + 1;
			} 
			else{
				tot_f = tot_f + 1;
			}
			System.out.println("Digite o tempo de vida (em meses) da "+i+"° criança: ");
			meses = sc.nextInt();
			if(meses <= 24){
				tot24 = tot24 + 1;
			}
		}
		if(num_cri > 0){
			porc_m = tot_m * 100/num_cri;
			porc_f = tot_f * 100/num_cri;
			porc24 = tot24 * 100/num_cri;
		}
		System.out.println("O percentual de crianças mortas do sexo masculino é de: "+porc_m);
		System.out.println("O percentual de crianças mortas do sexo feminino é de: "+porc_f);
		System.out.println("O percentual de crianças mortas com 24 meses ou menos é de: "+porc24);
	}
}