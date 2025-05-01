

public class Fluxo1 {
    public static void main(String[] args) {
        for(int i = 0 ; i<=20 ; i++){
            System.out.println(i);
        }
        String alunos[] = {"Felipe" , "Jonas" , "julia" , "Marcos"};
        for(int oi=0 ; oi<alunos.length ; oi++){
            System.out.println(alunos[oi]);
        }
        for(String aluno : alunos){
            System.out.println(aluno);
        }
    }
}
