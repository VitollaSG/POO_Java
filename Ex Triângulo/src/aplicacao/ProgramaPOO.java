package src.aplicacao;
import java.util.Scanner;
import src.entidades.Triangulo;
public class ProgramaPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       Triangulo x, y;
       x = new Triangulo();
       y = new Triangulo();

        System.out.println("Digite as medidas do traiangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do traiangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A area do triagulo X é: %.4f%n", areaX);
        System.out.printf("A area do triagulo Y é: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Maior área: X");
        }
        else{
            System.out.println("Maior área: Y");
        }
    }
}