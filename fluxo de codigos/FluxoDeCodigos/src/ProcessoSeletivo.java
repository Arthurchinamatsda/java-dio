
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
   public ProcessoSeletivo() {
   }

   public static void main(String[] args) {
      validaçãoDoSalario(1900.0);
      validaçãoDoSalario(2000.0);
      validaçãoDoSalario(2100.0);
      voluntarios();
   }

   static void voluntarios() {
      Scanner scanner = (new Scanner(System.in)).useLocale(Locale.US);
      String[] listaDosVoluntarios = new String[]{"Maria", "Akira", "Sayuri", "Laura", "Angerica", "Antonio", "Namorado da sayuri", "arthur"};
      ArrayList<String> listaTeste = new ArrayList();
      double valorBase = 2000.0;
      int voluntarioDeAgora = 0;

      for(int quantidadeDeVoluntario = 0; quantidadeDeVoluntario < 5 && voluntarioDeAgora < listaDosVoluntarios.length; ++voluntarioDeAgora) {
         String lista = listaDosVoluntarios[voluntarioDeAgora];
         double valorDesejado = scanner.nextDouble();
         if (valorDesejado < valorBase) {
            System.out.println(valorDesejado);
            listaTeste.add(lista + " pediu " + valorDesejado);
            ++quantidadeDeVoluntario;
         }
      }

      System.out.println(listaTeste);
   }

   static void validaçãoDoSalario(double valorDoVoluntario) {
      double valorBase = 2000.0;
      if (valorDoVoluntario < valorBase) {
         System.out.println("Ligar ao candidato");
      } else if (valorDoVoluntario == valorBase) {
         System.out.println("Tentar contra proposta");
      } else {
         System.out.println("esperar outros voluntarios");
      }
   }
    
}
