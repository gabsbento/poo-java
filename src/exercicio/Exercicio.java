package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite a medida do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite a medida do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("A area do triangulo x: %.4f%n",areaX);
        System.out.printf("A area do triangulo y: %.4f%n",areaY);
        if(areaX > areaY)
            System.out.println("A maior area é do triangulo x");
        else
            System.out.println("A maior area é do triangulo y");

        sc.close();
    }
}
