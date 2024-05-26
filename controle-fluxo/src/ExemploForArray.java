public class ExemploForArray {
    public static void main(String[] args) {

        //em Arrays o índice inicia em ZERO
        String alunos [] = { "Felipe", "Jonas", "Julia", "Marcos"};

        for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x=" + x + "é" + alunos[x]);
        }
/*
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};
        
        for(String aluno : alunos){
            System.out.println("Nome do aluno é : " + aluno);
        }
    */
    }
    
}
