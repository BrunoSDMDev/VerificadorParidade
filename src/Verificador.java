public class Verificador {
  public static String Verificacao (int numeroASerVerificado) {
      if (numeroASerVerificado % 2 == 0) {
          return "O número " + numeroASerVerificado + " é par!";
      } else {
          return ("O número " + numeroASerVerificado + " é ímpar!");
      }
  }
}