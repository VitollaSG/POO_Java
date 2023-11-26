package entidades;

public class Dados {
    public String nome;
    public double salBruto;
    public double taxa;

   public double salLiq(){
       return salBruto - taxa;
   }
   public void novoSal(double percentual){

       salBruto += salBruto * percentual / 100;
   }

    public  String toString(){
       return String.format("%s, R$%.2f", nome, salLiq());
    }
}
