//faça um programa que peça 4 notas e calcule a media delas
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = scan.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double n4 = scan.nextDouble();

        double media = (n1 + n2 + n3 + n4)/4;

        System.out.println("A média do aluno(a) foi: " + media);

        
    }
    
}
