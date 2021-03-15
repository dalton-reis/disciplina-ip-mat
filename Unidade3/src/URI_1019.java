import java.util.Scanner;

public class URI_1019 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    // Entrada
    int tempoDuracaoSegundos = teclado.nextInt();

    // Processo
    int horas = tempoDuracaoSegundos / 3600;    // só parte inteira
    int segundosRestoHoras = tempoDuracaoSegundos % 3600; // só parte do resto dadivisão
    int minutos = segundosRestoHoras / 60;
    int segundosRestoMinutos = tempoDuracaoSegundos % 60;
    int segundos = segundosRestoMinutos;

    // Código alternativo
    // horas = tempoDuracaoSegundos / 3600;
    // minutos = (tempoDuracaoSegundos % 3600) / 60;
    // segundos = tempoDuracaoSegundos % 60;

    // Saída
    System.out.println(horas+":"+minutos+":"+segundos);

    teclado.close();
  }
}
