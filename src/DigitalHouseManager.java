import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {
    List<Aluno>listaDeAlunos = new ArrayList<>();
    List<Professor>listaDeProfessores = new ArrayList<>();
    List<Curso>listaDeCursos = new ArrayList<>();
    List<Matricula>listaDeMatriculas = new ArrayList<>();

    public DigitalHouseManager(List<Aluno>listaDeAlunos, List<Professor>listaDeProfessores, List<Curso>listaDeCursos, List<Matricula>listaDeMatriculas) {

    }

    public void registrarCurso(String nome, Integer codCurso, Integer qtdMaximaDeAlunos){
        Curso curso = new Curso(nome, codCurso, qtdMaximaDeAlunos);
        listaDeCursos.add(curso);
        System.out.println(curso + "adicionado com sucesso");
    }

    public void excluirCurso(Integer codCurso){
        listaDeCursos.remove(codCurso);
        System.out.println(codCurso + "removido com sucesso");
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codProf, Integer qtdHoras){
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, codProf, qtdHoras);
        listaDeProfessores.add(professorAdjunto);
        System.out.println(professorAdjunto + "adicionado com sucesso");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codProf, String especialidade){
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, 0, codProf, especialidade);
        listaDeProfessores.add(professorTitular);
        System.out.println(professorTitular + "adicionado com sucesso");
    }

    public void excluirProfessor(Integer codProf){
        listaDeProfessores.remove(codProf);
        System.out.println(codProf + "removido com sucesso");
    }

    public void registrarAluno(String nome, String sobrenome, Integer codAluno){
        Aluno aluno = new Aluno(nome, sobrenome, codAluno);
    }

    public void matricularAluno(Integer codAluno, Integer codCurso){
        Aluno aluno = null;
        Curso curso = null;


        for (Aluno i : listaDeAlunos) {
            if(codCurso.equals(i)){
                aluno = i;
                for (Curso j : listaDeCursos) {
                    if(codAluno.equals(j)){
                        curso = j;
                    }else{
                        System.out.println("curso não encontrado");
                    }
                }
            }else{
                System.out.println("aluno não encontrado");
            }
        }

        if(curso.listaDeAlunos.size() < curso.getQtdMaxAluno()) {
            Matricula matricula = new Matricula(aluno, curso, new Date());
            System.out.println("matricula do aluno " + aluno + "realizada com sucesso");
            listaDeMatriculas.add(matricula);
        }else{
            System.out.println("não há vagas para esse curso");
        }
    }




}
