package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.produto;


public class programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        produto produto = new produto();
        System.out.println("Insira o NOME, PREÇO E QUANTIDADE do produto: ");

        System.out.print("Nome: ");
        produto.nome = sc.nextLine();

        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade no estoque: ");
        produto.quant = sc.nextInt();

        System.out.println("Insira a quantidade de produtos entraram no estoque: ");
        produto.novosProdutos(sc.nextInt());

        System.out.println("Insira a quantidade de procutos que sairam do estoque: ");
        produto.removerProdutos(sc.nextInt());

        System.out.println(produto);

        sc.close();
    }

}


