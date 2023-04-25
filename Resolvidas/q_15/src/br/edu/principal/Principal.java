package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        int cont_time, cont_jog, idade, qtde, total80;
        double peso, alt, media_idade = 0, media_altura = 0, porc;
        qtde = 0;
        total80 = 0;
        
        for (cont_time = 1; cont_time <= 5; cont_time++) {
            media_idade = 0;
            for (cont_jog = 1; cont_jog <= 11; cont_jog++) {
                System.out.print("Informe a idade do jogador: ");
                idade = sc.nextInt();
                System.out.print("Informe o peso do jogador: ");
                peso = sc.nextDouble();
                System.out.print("Informe a altura do jogador: ");
                alt = sc.nextDouble();
                
                if (idade < 18) {
                    qtde++;
                }
                
                media_idade += idade;
                media_altura += alt;
                
                if (peso > 80) {
                    total80++;
                }
            }
            
            media_idade /= 11;
            System.out.println("Média de idade do time " + cont_time + ": " + media_idade);
        }
        
        media_altura /= 55;
        System.out.println("Média de altura de todos os jogadores: " + media_altura);
        
        porc = (double) total80 / 55 * 100;
        System.out.println("Percentual de jogadores com mais de 80 quilos: " + porc + "%");
        
        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + qtde);
        
    }

}

