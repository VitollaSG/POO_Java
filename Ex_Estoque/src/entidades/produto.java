package entidades;

public class produto {
    public String nome;
    public double preco;
    public int quant;
    public double valorTotalDeEstoque(){
        return preco * quant;
    }
    public void novosProdutos(int quant){

        this.quant += quant;
    }
    public void removerProdutos(int quant){

        this.quant -= quant;
    }

    public String toString(){
        return String.format("%s, R$ %.2f, %d unidades, total: %.2f%n", nome, preco, quant, valorTotalDeEstoque());
    }
}
