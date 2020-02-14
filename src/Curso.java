import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nomeCurso;
    private int codCurso;
    private int qtdMaxAluno;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;

    List<Aluno>listaDeAlunos = new ArrayList<>();


    public Curso() {
    }

    public Curso(String nomeCurso, int codCurso, int qtdMaxAluno) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.qtdMaxAluno = qtdMaxAluno;
    }

    public Curso(String nome, int codCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, int qtdMaxAluno, List<Aluno>listaDeAlunos) {
        this.nomeCurso = nome;
        this.codCurso = codCurso;
    }

    public Boolean adicionarUmAluno(Aluno umAluno){
        if(listaDeAlunos.size() < qtdMaxAluno) {
            listaDeAlunos.add(umAluno);
            return true;
        }else{
            System.out.println("quantidade maxima de alunos atingida!");
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        listaDeAlunos.remove(umAluno);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codCurso == curso.codCurso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCurso);
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nome) {
        this.nomeCurso = nome;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public int getQtdMaxAluno() {
        return qtdMaxAluno;
    }

    public void setQtdMaxAluno(int qtdMaxAluno) {
        this.qtdMaxAluno = qtdMaxAluno;
    }
}
