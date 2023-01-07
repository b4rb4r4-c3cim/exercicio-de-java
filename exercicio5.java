//faça um programa que converta metros para centimetros 
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");
        double metros = scan.nextDouble();

        double cm = metros * 100;
        System.out.println("O valor em metros convertido para centimetros eh: " + cm);
    }

    
}
