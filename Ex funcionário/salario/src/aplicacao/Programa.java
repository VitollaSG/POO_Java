package aplicacao;

import java.util.Scanner;
import entidades.Dados;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dados dados = new Dados();

        System.out.println("Digite o nome do funionário: ");
        dados.nome = sc.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        dados.salBruto = sc.nextDouble();

        System.out.println("Qual a taxa? ");
        dados.taxa = sc.nextDouble();
        System.out.println("Dados: " + dados);

        //System.out.printf("%s, R$ %.2f%n", dados.nome, dados.salLiq() );

        System.out.println("Qual a porcentagem de aumento do salário? ");
        double percentual = sc.nextDouble();
        dados.novoSal(percentual);

        System.out.println("Reajuste: " + dados);


    }
}
