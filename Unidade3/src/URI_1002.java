import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1002 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_4 = new DecimalFormat("0.0000");

    // Entrada
    double raio = teclado.nextDouble();
    double pi = 3.14159;

    // Processo
    // double area = pi * (raio * raio);
    double area = pi * Math.pow(raio,2);

    // Saída
    System.out.println("A=" + df_4.format(area));

    teclado.close();
  }
}
