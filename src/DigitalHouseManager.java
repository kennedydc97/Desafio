import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {
    List<Aluno> listaDeAlunos = new ArrayList<>();
    List<Professor> listaDeProfessores = new ArrayList<>();
    List<Curso> listaDeCursos = new ArrayList<>();
    List<Matricula> listaDeMatriculas = new ArrayList<>();

    public DigitalHouseManager() {
    }

    public DigitalHouseManager(List<Aluno> listaDeAlunos, List<Professor> listaDeProfessores, List<Curso> listaDeCursos, List<Matricula> listaDeMatriculas) {

    }

    public void registrarCurso(String nome, Integer codCurso, Integer qtdMaximaDeAlunos) {
        Curso curso = new Curso(nome, codCurso, qtdMaximaDeAlunos);
        listaDeCursos.add(curso);
        System.out.println(curso + "adicionado com sucesso");
    }

    public void excluirCurso(Integer codCurso) {
        Curso rmvCurso = null;
        for (Curso i : listaDeCursos) {
            if(codCurso.equals(i.getCodCurso())){
                rmvCurso = i;
            }else{
                System.out.println("curso não encontrado");
            }
        }
        listaDeCursos.remove(rmvCurso);
        System.out.println(rmvCurso.getNomeCurso() + "removido com sucesso");
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codProf, Integer qtdHoras) {
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, codProf, qtdHoras);
        listaDeProfessores.add(professorAdjunto);
        System.out.println(professorAdjunto + "adicionado com sucesso");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codProf, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, 0, codProf, especialidade);
        listaDeProfessores.add(professorTitular);
        System.out.println(professorTitular + "adicionado com sucesso");
    }

    public void excluirProfessor(Integer codProf) {
        Professor rmvProfessor = null;

        for (Professor i : listaDeProfessores) {
            if(codProf.equals(i.getCodProfessor())){
                rmvProfessor = i;
            }else{
                System.out.println("professor não encontrado");
            }
        }

        listaDeProfessores.remove(rmvProfessor);
        System.out.println(rmvProfessor.getNomeProf() + "removido com sucesso");
    }

    public void registrarAluno(String nome, String sobrenome, Integer codAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codAluno);
        for (Aluno i : listaDeAlunos) {
            if(codAluno.equals(aluno.getCodAluno())){
                System.out.println("aluno ja registrado");
            }
        }
        listaDeAlunos.add(aluno);
        System.out.println("aluno adicionado com sucesso");
    }

    public void matricularAluno(Integer codAluno, Integer codCurso) {
        Aluno aluno = null;
        Curso curso = null;

        for (Aluno i : listaDeAlunos) {
            if (codAluno.equals(i.getCodAluno())) {
                aluno = i;
                for (Curso j : listaDeCursos) {
                    if (codCurso.equals(j.getCodCurso())) {
                        curso = j;
                    } else {
                        System.out.println("curso não encontrado");
                    }
                }
            } else {
                System.out.println("aluno não encontrado");
            }
        }

        if (curso.listaDeAlunos.size() < curso.getQtdMaxAluno()) {
            Matricula matricula = new Matricula(aluno, curso, new Date());
            System.out.println("matricula do aluno " + aluno + "realizada com sucesso");
            listaDeMatriculas.add(matricula);
        } else {
            System.out.println("não há vagas para esse curso");
        }
    }

    public void alocarProfessores(Curso codCurso, Integer codProfTit, Integer codProfAdj) {
        Curso curso = null;
        ProfessorTitular professorTitular = null;
        ProfessorAdjunto professorAdjunto = null;

        for (Curso i : listaDeCursos) {
            if (codCurso.equals(i.getCodCurso())) {
                curso = i;
            }
            for (Professor j : listaDeProfessores) {
                if(codProfTit.equals(j.getCodProfessor())){
                    professorTitular = (ProfessorTitular) j;
            }
            }
            for (Professor k : listaDeProfessores) {
                if (codProfAdj.equals(k.getCodProfessor())) {
                    professorAdjunto = (ProfessorAdjunto) k;
                }
            }
        }




    }
}
