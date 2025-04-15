import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0,00");
        Scanner sc= new Scanner(System.in);
        double area,a,b,c,sp;

        System.out.print(" Digite o valor do lado A-->");
        a= sc.nextDouble();
        System.out.print(" Digite o valor do lado B-->");
        b= sc.nextDouble();
        System.out.print(" Digite o valor do lado C-->");
        c= sc.nextDouble();

        sp=(a+b+c)/2;

        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));

        System.out.print("area=" + df.format(area));
    }
}
