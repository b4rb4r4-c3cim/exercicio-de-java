import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto voce ganha por hora trabalhada? ");
        double hora = scan.nextDouble();

        System.out.println("Quantas horas voce trabalha por mes? ");
        double horasMes = scan.nextDouble();

        double salarioBruto = hora * horasMes;
        double inss = (salarioBruto/100)*8;
        double sindicato = (salarioBruto/100)*5;
        double ir = (salarioBruto/100)*11;
        double totalDescon = inss + sindicato + ir;
        double salarioLiqu = salarioBruto - totalDescon;
        
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Inss: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("Ir: " + ir);
        System.out.println("Total descontado: " + totalDescon);
        System.out.println("Salario liquido: " + salarioLiqu);





       

    
}
}