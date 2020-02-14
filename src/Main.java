import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("kennedy", "dourado", 1010);
        Aluno aluno2 = new Aluno("kennedy", "dourado", 1010);
        Curso curso = new Curso();
        Matricula matricula = new Matricula(aluno1, curso, new Date());
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registrarAluno("kennedy", "dourado", 123);

        System.out.println(digitalHouseManager.listaDeAlunos.size());

        System.out.println(matricula.getDataDeMatricula());

        System.out.println(aluno1.equals(aluno2));
    }
}
