import java.util.Objects;

public class Professor {
    private String nomeProf;
    private String sobrenome;
    private int tempoDeCasa;
    private int codProfessor;


    public Professor() {
    }


    public Professor(String nomeProf, String sobrenome, int codProfessor) {
        this.nomeProf = nomeProf;
        this.sobrenome = sobrenome;
        this.codProfessor = codProfessor;
    }

    public Professor(String nome, String sobrenome, int tempoDeCasa, int codProfessor) {
        this.nomeProf = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codProfessor = codProfessor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return codProfessor == professor.codProfessor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codProfessor);
    }


    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nome) {
        this.nomeProf = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(int codProfessor) {
        this.codProfessor = codProfessor;
    }
}
