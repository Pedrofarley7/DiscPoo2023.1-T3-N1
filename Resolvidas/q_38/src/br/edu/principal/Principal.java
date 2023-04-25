package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        double salarioMinimo, valorKw, valorConta;
	        int tipoConsumidor, qtdeKw;
	        
	        System.out.print("Digite o valor do salário mínimo: ");
	        salarioMinimo = sc.nextDouble();
	        valorKw = salarioMinimo / 8;
	        
	        System.out.println("1 - Residencial");
	        System.out.println("2 - Comercial");
	        System.out.println("3 - Industrial");
	        System.out.print("Digite o tipo de consumidor (1 a 3): ");
	        tipoConsumidor = sc.nextInt();
	        
	        System.out.print("Digite a quantidade de quilowatts consumidos: ");
	        qtdeKw = sc.nextInt();
	        
	        if (tipoConsumidor == 1) {
	            valorConta = qtdeKw * valorKw;
	            if (qtdeKw > 100) {
	                valorConta += valorConta * 0.1;
	            }
	        } else if (tipoConsumidor == 2) {
	            valorConta = qtdeKw * valorKw;
	            if (qtdeKw > 1000) {
	                valorConta += valorConta * 0.3;
	            }
	        } else if (tipoConsumidor == 3) {
	            valorConta = qtdeKw * valorKw;
	            if (qtdeKw > 5000) {
	                valorConta += valorConta * 0.5;
	            }
	        } else {
	            System.out.println("Tipo de consumidor inválido!");
	            return;
	        }
	        
	        System.out.printf("Valor a ser pago: R$ %.2f\n", valorConta);
	        
	    }
	}

