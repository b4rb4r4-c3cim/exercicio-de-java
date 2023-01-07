//faça um programa que peça a temperatura em graus farenheit, transforme e mostre a temperatura em celsius
import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double far = scan.nextDouble();

        double celsius = (5* (far - 32)/9);
        System.out.println("A temperatura em celsius eh: " + celsius);

    }
    
}
