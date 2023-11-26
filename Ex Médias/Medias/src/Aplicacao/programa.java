package Aplicacao;

import java.util.Scanner;
import entidades.dados;

public class programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dados dados = new dados();

        System.out.println("Digite o nome do aluno: ");
        dados.nome = sc.nextLine();

        System.out.println("Digite as notas do aluno: ");
        dados.nota1 = sc.nextDouble();
        dados.nota2 = sc.nextDouble();
        dados.nota3 = sc.nextDouble();

        if (dados.media() <= 60){
            System.out.println(dados);
            System.out.println("Perdeu");
            System.out.printf("Restam %.2f pontos", 60 - dados.media());
        }
        else {
            System.out.println(dados);
            System.out.println("Passou");
        }
    }
}
