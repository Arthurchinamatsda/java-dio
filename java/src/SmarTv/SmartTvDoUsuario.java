package java.src.SmarTv;
public class SmartTvDoUsuario {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando volume para :"+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo volume para :"+volume);
    }
    public void aumentarCanal (){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void escolherCanal( int numeroCanal ){
        canal = numeroCanal;
    }
}
