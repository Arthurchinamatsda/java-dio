public class TiposDeVariaveis {
    public static void main(String[]args){
        int numeroInteiros = 12;
        float numerosDecimias = 1.60f;
        boolean verdadeiroOuFalso = false;
        double numerosDecimaisComum = 1.40;
        System.out.print(numeroInteiros);
        System.out.print(numerosDecimias);
        System.out.print(verdadeiroOuFalso);
        System.out.print(numerosDecimaisComum);
        int soma = 1+1;
        System.out.println(soma);
        int subitracao = 21-2;
        System.out.println(subitracao);
        int trocaDeValor = 4;
        trocaDeValor = - trocaDeValor;
        System.out.println(trocaDeValor);
        trocaDeValor = + trocaDeValor;
        System.out.println(trocaDeValor);
        trocaDeValor = trocaDeValor * -1;
        System.out.println(trocaDeValor);
        String concatenizacao = "1";
        concatenizacao = 1+1+1+1+"1";
        System.out.println(concatenizacao);
        concatenizacao = 1+1+1+"1"+1+1;
        System.out.println(concatenizacao);
        concatenizacao = "1"+(1+1+1);
        System.out.println(concatenizacao);
    }
}
