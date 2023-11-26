package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.dados;

public class programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        dados dados = new dados();

        System.out.println("Digite altura e largura do retângulo");
        dados.altura = sc.nextDouble();
        dados.largura = sc.nextDouble();

        System.out.println(dados);
        //System.out.println(dados.resPerimetro());
        //System.out.println(dados.resDiagonal());

        sc.close();
    }
}
