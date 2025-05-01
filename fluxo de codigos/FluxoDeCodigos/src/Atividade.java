import java.util.Scanner;
public class Atividade {
    public static void main(String[] args){
        teste();
        try{
            teste();
        }catch(IllegalArgumentException e){
            System.out.println("O Seguno parametro é maior que o prmeiro");
        }
    }

    public static void teste(){
        Scanner scan = new Scanner(System.in);
        int pV = scan.nextInt();
        int sV = scan.nextInt();
        int recebeP1 = pV;
        int recebeP2 = sV;
        int contagem = pV - sV;
        if(contagem<0){
            throw new IllegalArgumentException("erro");
        }
    for(int a=recebeP1 ; recebeP1>recebeP2 ; recebeP2++){
        System.out.println(recebeP2);
    }
    }
}

