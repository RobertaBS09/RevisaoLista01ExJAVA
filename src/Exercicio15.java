import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        double valor,taxa,prestacao;
        int tempo;

        System.out.print("Qual é o valor da prestação em atraso?");
        valor =sc.nextDouble();

        System.out.print("A quantos dias a prestação esta atrasada?");
        tempo= sc.nextInt();

        System.out.print("Qual é a taxa de atraso?");
        taxa=sc.nextDouble();

        prestacao= valor+(valor*(taxa/100)*tempo);

        System.out.println("O valor da prestação é de: "+ df.format(prestacao));

    }
}
