import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("kennedy", "dourado", 1010);
        Aluno aluno2 = new Aluno("kennedy", "dourado", 1010);
        Curso curso = new Curso();
        Matricula matricula = new Matricula(aluno1, curso, new Date());


        System.out.println(matricula.getDataDeMatricula());

        System.out.println(aluno1.equals(aluno2));
    }
}
