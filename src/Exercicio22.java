import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc= new Scanner(System.in);
        double area,raio;

        System.out.print("Digite o valor do raio: ");
        raio= sc.nextDouble();

        area= Math.PI*raio*raio;

        System.out.print(" A área da circuferência é de ---> " + df.format(area));
    }
}
