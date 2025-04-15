public class Escopo {
    double saldo = 10.0;
        public void pagarValor(int valor){
            System.out.println(saldo-valor);
        }
        public void calcularDividaExponencial(){
            double valorExponencial = 5;
            double montante = 0;
            for(int x=1 ; x<5 ; x++){
                double valorCalculado = valorExponencial * x;
                montante = montante + valorCalculado;
            }
        }
}
