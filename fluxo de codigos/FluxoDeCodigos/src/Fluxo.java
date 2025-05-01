public class Fluxo {
    public static void main(String[] args) {
        double saldo = 2.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }
        else
            System.out.println("saldo insuficiente");


        int nota = 6;

        if(nota>= 7)
            System.out.println("aprovaddo");

        else if (nota >= 5 && nota<7)
            System.out.println("prova de recuperação");

        else
            System.out.println("Reprovado");
    }
}
