import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce> mesada)
                mesada = valorDoce;
            mesada = mesada - valorDoce;
            System.out.println(mesada);
            System.out.println(valorDoce);
        }
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2 , 8);
    }
}
