import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0,00");
        Scanner sc = new Scanner(System.in);

        double v,d,t;

        System.out.printf("Digite o valor da distância percorrida em metros --->");
        d= sc.nextByte();
        System.out.printf("Digite o valor do tempo em horas --->");
        t= sc.nextByte();


        v=(d*1000)/(t*60);

        System.out.println("A velocidade do projétil em metros por segundo é : "+ df.format(v)+ "m/s");




    }
}
