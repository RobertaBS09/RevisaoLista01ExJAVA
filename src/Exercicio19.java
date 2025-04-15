import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        double v1,v2,v3,resultado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        v1=sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        v2=sc.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        v3=sc.nextDouble();

        resultado = Math.pow(v1,2)+Math.pow(v2,2)+Math.pow(v3,2);

        System.out.println("O resultado é: " + resultado);
    }
}
