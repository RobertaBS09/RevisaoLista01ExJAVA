import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0,00");
        Scanner sc= new Scanner(System.in);

        double pes,metros;

        System.out.print("Digite o valor em pés:  ");
        pes= sc.nextDouble();

        metros=pes*0.3048;

        System.out.println("O valor em Metros é de ---> " + df.format(metros));
    }
}
