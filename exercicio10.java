//faça um programa que peça a temperatura em celsius e tranforme para farenheit
import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double c = scan.nextDouble();

        double far = c * 1.8 + 32;
        System.out.println("A temperatura em farenheit eh: " + far);

    
}
}