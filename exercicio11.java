//faça um programa que peça dois numeros inteiros e um numero real.
//calcule e mostre:
//o produto do dobro do primeiro com metade do segundo.
//a soma do triplo do primeiro com o terceiro.
//o terceiro elevado ao cubo.

import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro: ");
        int v1 = scan.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        int v2 = scan.nextInt();

        System.out.println("Digite um numero real: ");
        double v3 = scan.nextDouble();

        int a = (2 * v1) * (v2/2);
        double b = (3*v1) + v3;
        double c = Math.pow(v3, 3);
        //a
        System.out.println("Letra a = " + a);
        //b
        System.out.println("Letra b = " + b);
        //c
        System.out.println("Letra c = " + c);

    }

    
}
