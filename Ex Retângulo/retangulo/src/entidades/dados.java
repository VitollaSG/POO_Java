package entidades;

public class dados {
    public double largura;
    public double altura;

    public double area(){
        return (largura * altura);

    }
    public double perimetro(){
        return (largura * 2) + (altura * 2);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura,2));
    }

    public String toString() {
        return String.format(" Area = %.2f%n ", area()) + String.format("Perímetro = %.2f%n ", perimetro()) + String.format("Diagonal = %.2f ", diagonal());

    }
    /*public String resPerimetro(){
        return  String.format("Perímetro = %.2f ", perimetro());
    }
    public String resDiagonal(){
        return String.format("Diagonal = %.2f ", diagonal());
    }*/

}

