//faça um programa que peça o raio de um circulo, calcule e mostre sua area 
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do circulo eh: " + area);
    }
    
}
