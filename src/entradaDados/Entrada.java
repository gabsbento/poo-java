package entradaDados;

import java.util.Locale;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println(a);
        sc.close();
    }
}
