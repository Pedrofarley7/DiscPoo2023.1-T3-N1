package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int num1, num2, soma = 0, qtde = 0, qtdePares = 0;

		    System.out.print("Digite o primeiro número: ");
		    num1 = sc.nextInt();

		    System.out.print("Digite o segundo número: ");
		    num2 = sc.nextInt();

		    if (num1 == num2) {
		      System.out.println("Números iguais");
		    } else if (num1 < num2) {
		      for (int i = num1; i <= num2; i++) {
		        soma += i;
		        qtde++;
		      }
		      double media = (double) soma / qtde;
		      System.out.println("Média: " + media);
		    } else if (num1 > num2) {
		      for (int i = num2; i <= num1; i++) {
		        if (i % 2 == 0) {
		          qtdePares++;
		 }
	 }
	 System.out.println("Quantidade de números pares: " + qtdePares);
  }
 }
}
