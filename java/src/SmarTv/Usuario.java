package java.src.SmarTv;

public class Usuario {
    public static void main(String[] args) {
        SmartTvDoUsuario smartTvDoUsuario = new SmartTvDoUsuario();
        System.out.println(smartTvDoUsuario.ligada);
        System.out.println(smartTvDoUsuario.canal);
        System.out.println(smartTvDoUsuario.volume);

        smartTvDoUsuario.ligar();
        System.out.println(smartTvDoUsuario.ligada);

        smartTvDoUsuario.desligar();
        System.out.println(smartTvDoUsuario.ligada);

        smartTvDoUsuario.aumentarVolume();
        System.out.println(smartTvDoUsuario.volume);

        smartTvDoUsuario.diminuirVolume();
        System.out.println(smartTvDoUsuario.volume);
        smartTvDoUsuario.aumentarCanal();
        System.out.println(smartTvDoUsuario.canal);
        smartTvDoUsuario.diminuirCanal();
        System.out.println(smartTvDoUsuario.canal);
        smartTvDoUsuario.escolherCanal(2);
        System.out.println(smartTvDoUsuario.canal);
    }
}
