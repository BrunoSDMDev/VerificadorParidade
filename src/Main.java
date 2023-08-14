import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Verificador verificador = new Verificador();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número e saiba se ele é par ou ímpar: ");
    int numeroASerVerificado = scanner.nextInt();

        System.out.println(Verificador.Verificacao(numeroASerVerificado));



        }

}