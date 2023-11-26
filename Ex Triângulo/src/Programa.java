package src;

import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite as medidas do traiangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite as medidas do traiangulo X: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
