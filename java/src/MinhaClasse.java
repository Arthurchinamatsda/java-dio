package java.src;
public class MinhaClasse {
    public static void main (String [] args) {
        System.out.print ( "ola moço");


        int ano = 2021;
        ano = 2025;

        final String BR = "Brasil";

        final double pi = 3.14;

        boolean simNao = true;
        simNao = false;
        
        String primeiroNome = "maria";
        String segundoNome = "eduarda";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "resultado do metodo" + primeiroNome.concat("").concat(segundoNome);
    }
}
