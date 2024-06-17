package entradaDados;

import java.util.Locale;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um double");
        double a = sc.nextDouble();
        System.out.println(a);
        System.out.println("Digite um char");
        char x = sc.next().charAt(0);
        System.out.println("Digite um texto");
        String y = sc.next();
        System.out.println("Digite um inteiro");
        int e = sc.nextInt();
        // Quebra de Linha
        sc.nextLine();
        String s1, s2, s3;
        System.out.println("Digite Texto");
        s1 = sc.nextLine();
        System.out.println("Digite Texto");
        s2 = sc.nextLine();
        System.out.println("Digite Texto");
        s3 = sc.nextLine();
        System.out.println("s1:"+s1+"\ns2:"+s2+"\ns3:"+s3);
        // quebra de linha pendente
        sc.close();

    }
}
