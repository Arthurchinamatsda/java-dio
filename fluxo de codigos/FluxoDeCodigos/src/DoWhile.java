import java.util.Random;
public class DoWhile {
    public static void main(String[] args) {
        System.out.println("discando...");
        do {
            System.out.println("tocando");
        } while(tocando());
            System.out.println("Alo!!");
        
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==(1);
        System.out.println("atendeu?" + atendeu);
        return ! atendeu;
    }
}
